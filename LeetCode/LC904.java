package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author chen_y
 * @date 2025-08-04 9:22
 */
public class LC904 {
    //题目翻译：从fruits选出两个不同的数字，可以从任意下标开始，但遇到其他数字就停止，求能选出的最大长度
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        if(n<=2){
            return n;
        }
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int lastIndex=0;
        for(int i=0;i<n;i++){
            if(map.isEmpty()){
                map.put(fruits[i],i);
            }else if(!map.containsKey(fruits[i]) && map.size()==1){
                map.put(fruits[i],i);
            } else if (map.containsKey(fruits[i]) && fruits[i]!=fruits[i-1]) {
                map.put(fruits[i],i);
            } else if (!map.containsKey(fruits[i])){
                ans=Math.max(ans,i-lastIndex);
                lastIndex=map.get(fruits[i-1]);
                map.remove(fruits[lastIndex-1]);
                map.put(fruits[i],i);
            }
        }
        ans=Math.max(ans,n-lastIndex);
        return ans;
    }

    public static void main(String[] args) {
        LC904 lc904 = new LC904();
        lc904.totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4});
    }
}
