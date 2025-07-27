package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-01 8:38
 */
public class LC3330 {
    public int possibleStringCount(String word) {
        int ans=1;
        char[] s=word.toCharArray();
        for(int i=1;i<s.length;i++){
            ans+=s[i]==s[i-1]?1:0;
        }
        return ans;
    }
}
