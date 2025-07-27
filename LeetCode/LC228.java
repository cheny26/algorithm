package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chen_y
 * @date 2025-07-21 18:42
 */
public class LC228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int j=i;
            while(j+1<nums.length && nums[j+1]==nums[j]){
                j++;
            }
            StringBuilder sb=new StringBuilder(Integer.toString(nums[i]));
            if(i!=j) {
                sb.append("->");
                sb.append(nums[j]);
            }
            ans.add(sb.toString());
            i=j;
        }
        return ans;
    }
}
