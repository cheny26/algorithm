package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-10 9:12
 */
public class LC26 {
    public static int removeDuplicates(int[] nums) {
        int len=nums.length;
        int pre=nums[0];
        int curIndex=1,index=1;
        while(index<len){
            while(index<len && nums[index]<=pre){
                index++;
            }
            if(index==len) break;
            pre=nums[index];
            nums[curIndex++]=nums[index];
        }
        return curIndex;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,2});
    }
}
