package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-16 8:20
 */
public class LC3201 {
    public int maximumLength(int[] nums) {
        //统计数组中奇数个数
        int oddCount=nums[0]&1;
        int preNum=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if((nums[i]&1) != (preNum&1)){
                count++;
                preNum=nums[i];
            }
           oddCount+=nums[i]&1;
        }
        return Math.max(count,Math.max(oddCount,nums.length-oddCount));
    }
}
