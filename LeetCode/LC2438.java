package LeetCode;

import java.util.ArrayList;

/**
 * @author chen_y
 * @date 2025-08-11 15:07
 */
public class LC2438 {


    public int[] productQueries(int n, int[][] queries) {
        int MOD=1000000007;
        int[] ans=new int[queries.length];
        char[] binaryStr=Integer.toBinaryString(n).toCharArray();
        ArrayList<Integer> powers=new ArrayList<>();
        for(int i= binaryStr.length-1,pre=1;i>=0;i--,pre*=2){
            if(binaryStr[i]=='1'){
                powers.add(pre);
            }
        }
        for(int i=0;i<queries.length;i++){
            int t=1;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                t=(t*powers.get(j))%MOD;
            }
            ans[i]=t;
        }
        return ans;
    }

    public static void main(String[] args) {
        LC2438 lc2438 = new LC2438();
        lc2438.productQueries(15,new int[][]{{0,1},{2,2},{0,3}});
    }
}
