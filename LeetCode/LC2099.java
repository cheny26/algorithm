package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author chen_y
 * @date 2025-06-28 12:44
 */
public class LC2099 {
    public static int[] maxSubsequence(int[] nums, int k) {
        int[] temp=Arrays.copyOf(nums,nums.length);
        int[] ans=new int[k];
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length-k;i++){
            map.put(temp[i],map.getOrDefault(temp[i],0)+1);
        }
        for(int i=0,curI=0;curI< k;i++){
            if(map.containsKey(nums[i]) && map.get(nums[i])>0){
                map.put(nums[i],map.get(nums[i])-1);
            }else{
                ans[curI++]=nums[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,1,3,3};
        maxSubsequence(nums,2);
    }
}
