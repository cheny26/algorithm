package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chen_y
 * @date 2025-07-28 15:50
 */
public class LC39 {
    public List<List<Integer>> ans=new ArrayList<>();
    public List<Integer> path=new ArrayList<>();
    public int t;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        t=target;
        dfs(candidates,0,0);
        return ans;
    }
    public void dfs(int[] nums,int index,int cur){
        if(cur==t){
            ans.add(new ArrayList<>(path));
            return;
        }
        if(cur>t || index==nums.length){
            return;
        }
        //继续要这个位置
        path.add(nums[index]);
        dfs(nums,index,cur+nums[index]);
        path.removeLast();
        //不要这个位置
        dfs(nums,index+1,cur);
    }
}
