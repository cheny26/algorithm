package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-16 19:09
 */
public class LC125 {
    public boolean isPalindrome(String s) {
        char[] temp =s.toLowerCase().toCharArray();
        for(int i=0,j= temp.length-1;i<j;i++,j--){
            while(i<j && !check(temp[i])){
                i++;
            }
            while(j>i && !check(temp[j])){
                j--;
            }
            if(temp[i]!=temp[j]){
                return false;
            }
        }
        return true;
    }
    public boolean check(char c){
        return c >= 'a' && c <= 'z' || c >= '0' && c <= '9';
    }
}
