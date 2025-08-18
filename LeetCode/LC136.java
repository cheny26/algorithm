package LeetCode;

import java.util.Arrays;

/**
 * @author chen_y
 * @date 2025-08-14 19:11
 */
public class LC136 {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i:nums){
            ans^=i;
        }
        return ans;
    }
}
