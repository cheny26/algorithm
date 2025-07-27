package LeetCode;

import java.util.HashMap;

/**
 * @author chen_y
 * @date 2025-07-11 17:37
 */
public class LC169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxCountNum=0,maxCount=0;
        for(int i:nums){
            int count=map.getOrDefault(i,0)+1;
            map.put(i,count);
            if(maxCount<count){
                maxCountNum=i;
                maxCount=count;
            }
        }
        return maxCountNum;
    }
}
