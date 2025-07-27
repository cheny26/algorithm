package LeetCode;

/**
 * @author chen_y
 * @date 2025-07-25 8:01
 */
public class LC3487 {
    public int maxSum(int[] nums) {
        byte[] set=new byte[101];
        int maxMin=-101;
        int sum=0;
        for(int i:nums){
            if(i<=0){
                maxMin=Math.max(i,maxMin);
            }else if(set[i]==0){
                set[i]=1;
                sum+=i;
            }
        }
        return sum!=0?sum:maxMin;
    }
}
