package LeetCode;

import java.util.Arrays;

/**
 * @author chen_y
 * @date 2025-08-16 22:36
 */
public class LC1323 {
    public int maximum69Number (int num) {
        StringBuilder sb=new StringBuilder();
        String str=String.valueOf(num);
        for(int i=0;i<str.length();i++){
            sb.append("9");
            if(str.charAt(i)=='6'){
                sb.append(str, i, str.length());
                return Integer.parseInt(sb.toString());
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
