package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author chen_y
 * @date 2025-07-28 14:55
 */
public class LC17 {
    public  HashMap<Integer,String> map=new HashMap<>();
    {
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
    }
    public List<String> ans=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(!digits.isEmpty()){
            dfs(digits,0,new StringBuilder());
        }
        return ans;
    }
    public void dfs(String digits,int index,StringBuilder cur){
        if(index==digits.length()){
            ans.add(cur.toString());
            return;
        }
        int curNum=digits.charAt(index)-'0';
        for(char temp:map.get(curNum).toCharArray()){
            dfs(digits,index+1,cur.append(temp));
            cur.delete(index,index+1);
        }
    }
}
