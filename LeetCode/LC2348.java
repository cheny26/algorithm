package LeetCode;

/**
 * @author chen_y
 * @date 2025-08-19 20:44
 */
public class LC2348 {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0,count=0;
        for(int i:nums){
            if(i==0){
                count++;
            }else if(count!=0){
                ans+=(count+1)*count>>1;
                count=0;
            }
        }
        ans+=(count+1)*count>>1;
        return ans;
    }
}
