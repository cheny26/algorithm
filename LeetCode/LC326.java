package LeetCode;

/**
 * @author chen_y
 * @date 2025-08-13 18:27
 */
public class LC326 {
    public boolean isPowerOfThree(int n) {
        if(n<=0 || n%3!=0){
            return false;
        }
        int num=n,r=0;
        while(num>1){
            r=num%3;
            num/=3;
            if(r!=0){
                return false;
            }
        }
        return true;
    }
}
