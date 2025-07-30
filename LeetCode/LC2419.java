package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-30 8:52
 */
public class LC2419 {
    /**
     * & 与运算
     * a & 比他更小的数 < a
     * 求数组元素与运算最大值==》求元素最大值
     */
    public int longestSubarray(int[] nums) {
        int max=nums[0],cur=1,ans=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                ans=cur=1;
            }else if(nums[i]<max){
                cur=0;
            }else{
                cur++;
            }
            ans=Math.max(cur,ans);
        }
        return ans;
    }
}
