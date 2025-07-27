package LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author chen_y
 * @date 2025-07-11 11:48
 */
public class LC3169 {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(o1, o2) -> {
            if(o1[0]!=o2[0])
                return o1[0]-o2[0];
            return o1[1]-o2[1];
        });
        int countDays=meetings[0][0]-1;
        int preEnd=meetings[0][1];
        for(int i=1;i<meetings.length;i++){
            if(meetings[i][0]>preEnd){
                countDays+=meetings[i][0]-preEnd-1;
                preEnd=meetings[i][1];
            }else if(meetings[i][0]==preEnd){
                preEnd=meetings[i][1];
            } else {
                preEnd=Math.max(preEnd,meetings[i][1]);
            }
        }
        countDays+=days-preEnd;
        return countDays;
    }

    public static void main(String[] args) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((o1, o2) -> {
            if(o1[0]!=o2[0])
                return o1[0]-o2[0];
            return o1[1]-o2[1];
        });
        pq.add(new int[]{1,4});
        pq.add(new int[]{1,2});
        pq.add(new int[]{2,4});
        pq.add(new int[]{2,1});
        System.out.println(Arrays.toString(pq.poll()));
        System.out.println(Arrays.toString(pq.poll()));
        System.out.println(Arrays.toString(pq.poll()));
        System.out.println(Arrays.toString(pq.poll()));
    }
}
