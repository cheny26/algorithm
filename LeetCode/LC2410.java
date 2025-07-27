package LeetCode;

import java.util.Arrays;

/**
 * @author chen_y
 * @date 2025-07-13 15:06
 */
public class LC2410 {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0,j=0,count=0;
        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                i++;
                j++;
                count++;
            }else{
                while(j<trainers.length && players[i]>trainers[j]){
                    j++;
                }
            }
        }
        return count;
    }
}
