package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-12 11:57
 */
public class LC80 {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int count=1,preNum=nums[0],ansLen=1;
        for(int i=1;i<len;i++){
            if(nums[i]!=preNum){
                count=1;
                preNum=nums[i];
                ansLen++;
            }else if(count<2){
                count++;
                ansLen++;
            }
        }
        return ansLen;
    }
}
