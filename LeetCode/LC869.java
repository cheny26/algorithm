package LeetCode;

import java.util.Arrays;

/**
 * @author chen_y
 * @date 2025-08-10 12:01
 */
public class LC869 {
    public boolean reorderedPowerOf2(int n) {
        int pre=1;
        char[] num=String.valueOf(n).toCharArray();
        Arrays.sort(num);
        for(int i=1;i<32;i++){
            char[] t=String.valueOf(pre).toCharArray();
            if(t.length==num.length){
                Arrays.sort(t);
                if(Arrays.equals(t, num)){
                    return true;
                }
            }else if(t.length>num.length){
                return false;
            }
            pre=2*pre;
        }
        return false;
    }

    public static void main(String[] args) {
        LC869 lc869 = new LC869();
        lc869.reorderedPowerOf2(16);
    }
}
