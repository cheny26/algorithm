package LeetCode;

import java.util.Arrays;

/**
 * @author chen_y
 * @date 2025-07-22 7:42
 */
public class LC1695 {
    public int maximumUniqueSubarray(int[] nums) {
        int maxSum=0,curSum=0,start=0;
        int[] preIndex=new int[10001];
        Arrays.fill(preIndex,-1);
        int[] sum=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            sum[i+1]=nums[i]+sum[i];
            int pre=preIndex[nums[i]];
            if(pre==-1 || pre<start){
                curSum+=nums[i];
            }else{
                curSum=sum[i+1]-sum[pre+1];
                start=pre+1;
            }
            preIndex[nums[i]]=i;
            maxSum=Math.max(maxSum,curSum);
        }
        return maxSum;
    }
}
