package LeetCode;

/**
 * @author chen_y
 * @date 2025-08-05 9:11
 */
public class LC3477 {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans=0;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(baskets[j]>=fruits[i] ){
                    ans++;
                    baskets[j]=-1;
                    break;
                }
            }
        }
        return fruits.length-ans;
    }
}
