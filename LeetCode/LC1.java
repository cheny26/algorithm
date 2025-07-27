package LeetCode;

import java.util.HashMap;

/**
 * @author chen_y
 * @date 2025-06-27 12:55
 */
public class LC1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        twoSum(new int[]{2,7,11,15},9);
    }
}
