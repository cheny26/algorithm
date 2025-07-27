package LeetCode;

import java.util.*;

/**
 * @author chen_y
 * @date 2025-07-15 8:40
 */
public class LC3136 {
    public boolean isValid(String word) {
        int len=word.length();
        if(len<3) return false;
        boolean isHaveAEIOU=false,isHaveElse=false;
        Set<Character> set= new HashSet<>();
        Collections.addAll(set, 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u');
        for(char c:word.toCharArray()){
            if(!isHaveAEIOU && set.contains(c)){
                isHaveAEIOU=true;
            }else if(c>='0' && c<='9'){
                continue;
            }else if((c>='A' && c<='Z') ||(c>='a' && c<='z')){
                continue;
            }else{
                return false;
            }
        }
        return isHaveAEIOU;
    }
}
