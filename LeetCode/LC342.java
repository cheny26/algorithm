package LeetCode;

/**
 * @author chen_y
 * @date 2025-08-15 14:01
 */
public class LC342 {
    public boolean isPowerOfFour(int n) {
        char[] binaryStr = Integer.toBinaryString(n).toCharArray();
        int countOfOne=0,countOfZero=0;
        for(char c:binaryStr){
            if(c=='0'){
                countOfZero++;
            }else {
                countOfOne++;
                if(countOfOne>1){
                    return false;
                }
            }
        }
        return countOfZero%2==0 && countOfOne==1;
    }
}
