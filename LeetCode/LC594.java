package LeetCode;

import java.util.Arrays;

/**
 * @author chen_y
 * @date 2025-06-30 7:49
 */
public class LC594 {
    public static int findLHS(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        int l=0,r=0;
        while(l<nums.length){
            while(r<nums.length && (nums[r]-nums[l]==1 || nums[r]-nums[l]==0)){
                r++;
            }
            if(r== nums.length){
                if(nums[r-1]-nums[l]==1)
                    return Math.max(r-l,ans);
                else if(nums[r-1]-nums[l]<1){
                    return ans;
                }
            }else if(r-l>=2 && nums[r-1]-nums[l]==1){
                ans=Math.max(ans,r-l);
            }
            while(l<r && !(nums[r]-nums[l]==1 || nums[r]-nums[l]==0)){
                l++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        findLHS(new int[]{1,4,1,3,1,-14,1,-13});
    }
}
