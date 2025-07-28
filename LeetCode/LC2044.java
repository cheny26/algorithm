package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chen_y
 * @date 2025-07-28 9:43
 */
public class LC2044 {
    public int max=0,ans=0;
    public int countMaxOrSubsets(int[] nums) {
        for(int i:nums){
            max|=i;
        }
        process(nums,0, 0);
        return ans;
    }

    public void process(int[] nums, int index, int temp){
        if(temp==max){
            ans+= (int) Math.pow(2, nums.length-index);
            return;
        }
        if(index==nums.length){
            return;
        }
        process(nums,index+1,temp|nums[index]);
        process(nums,index+1,temp);
    }
}
