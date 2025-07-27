package LeetCode;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author chen_y
 * @date 2025-07-05 8:56
 */
public class LC1394 {
    public int findLucky(int[] arr) {
        int[] count=new int[501];
        int max=0;
        for(int i:arr){
            count[i]++;
            max=Math.max(max,i);
        }
        for(int i=max;i>=0;i--){
            if(count[i]==i) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer a=300;
        Integer b=300;
        System.out.println(a==b);
    }
}
