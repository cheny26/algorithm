package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author chen_y
 * @date 2025-06-27 16:51
 */
public class LC49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            String t=help(s);
            List<String> list = map.getOrDefault(t, new ArrayList<>());
            list.add(s);
            if(list.size()==1){
                map.put(t,list);
                ans.add(list);
            }
        }
        return ans;
    }

    public  String help(String s){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return String.copyValueOf(charArray);
    }

}
