package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-16 19:26
 */
public class LC392 {
    public boolean isSubsequence(String s, String t) {
        int len1=s.length(),len2=t.length();
        if(len1>len2) {
            return false;
        }
        int i=0,j=0;
        while(j<len2){
            if(i<len1 && t.charAt(j)==s.charAt(i)){
                i++;
            }
            j++;
        }
        return i==len1;
    }


}
