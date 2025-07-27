package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-14 21:14
 */
public class LC14 {
    public String longestCommonPrefix(String[] strs) {
        int maxPrefixLen=strs[0].length();
        for(int i=1;i<strs.length;i++){
            maxPrefixLen=Math.min(strs[i].length(),maxPrefixLen);
            for(int j=0;j<strs[i].length() && j<maxPrefixLen;j++){
                if(strs[i].charAt(j)!=strs[0].charAt(j)){
                    maxPrefixLen-=(maxPrefixLen-j);
                }
            }
            if(maxPrefixLen==0){
                return "";
            }
        }
        return strs[0].substring(0,maxPrefixLen-1);
    }
}
