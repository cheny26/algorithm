package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-27 7:30
 */
public class LC2210 {
    public int countHillValley(int[] nums) {
        int ans=0,pre=nums[0];
        for(int i=1;i<nums.length-1;i++){
            if(((nums[i]-pre)^(nums[i]-nums[i+1]))>=0){
                ans++;
                pre=nums[i];
            }
        }
        return ans;
    }
}
