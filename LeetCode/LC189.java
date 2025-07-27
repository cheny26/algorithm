package LeetCode;

import java.util.Arrays;

/**
 * @author chen_y
 * @date 2025-07-01 19:22
 */
public class LC189 {
    public void rotate(int[] nums, int k) {
        k%=k;
        if(k==0)
            return;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);
    }
    public void reverse(int[] nums,int l,int r){
        while (l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}
