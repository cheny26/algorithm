package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author chen_y
 * @date 2025-07-28 18:14
 */
public class LC118 {

    public List<List<Integer>> generate(int numRows) {
        int[][] ans=new int[numRows][];
        for (int i=0;i<numRows;i++){
            ans[i]=new int[i+1];
            ans[i][0]=1;
            ans[i][i]=1;
            for(int j=1;j<i+1;j++){
                ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int[] arr:ans){
            List<Integer> temp = new ArrayList<>();
            for (int num : arr) {
                temp.add(num);
            }
            list.add(temp);
        }
        return list;
    }
}
