package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chen_y
 * @date 2025-07-28 14:47
 */
public class LC78 {
    public List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums,0,new ArrayList<>());
        return ans;
    }
    public void dfs(int[] nums,int index,List<Integer> cur){
        if(index==nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        //不要index位置
        dfs(nums,index+1,cur);
        //要index位置
        cur.add(nums[index]);
        dfs(nums,index+1,cur);
        cur.removeLast();
    }
}
