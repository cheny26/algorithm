package LeetCode;

import java.util.*;

/**
 * @author chen_y
 * @date 2025-07-19 8:13
 */
public class LC1233 {
    public List<String> removeSubfolders(String[] folder) {
        List<String> ans=new ArrayList<>();
        Arrays.sort(folder);
        for(int i=0;i<folder.length;i++){
            String temp=folder[i]+"/";
            ans.add(folder[i]);
            int j=i+1;
            while(j<folder.length && folder[j].startsWith(temp)){
                j++;
            }
            i=j-1;
        }
        return ans;
    }
    public List<String> removeSubfolders1(String[] folder) {
        List<String> ans=new ArrayList<>();

        HashSet<String> set = new HashSet<>(Arrays.asList(folder));
        for(String s:folder){
            boolean falg=false;
            for(String s1:getFatherFolders(s)){
                if(set.contains(s1)){
                    falg=true;
                    break;
                }
            }
            if(!falg){
                ans.add(s);
            }
        }
        return ans;
    }
    public ArrayList<String> getFatherFolders(String s){
        ArrayList<String> ans=new ArrayList<>();
        while(s.lastIndexOf("/")!=-1){
             ans.add(s.substring(0,s.lastIndexOf("/")));
             s=s.substring(0,s.lastIndexOf("/"));
        }
        return ans;
    }
}
