package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author chen_y
 * @date 2025-07-07 11:00
 */
public class LC1353 {
    public int maxEvents(int[][] events) {
        int[] days=new int[100001];
        int len=events.length;
        int curDay=100000;
        int count=0;
        event[] es=new event[len];
        for(int i=0;i<events.length;i++){
            es[i]=new event(events[i][0],events[i][1]);
        }
        Arrays.sort(es);
        for(int i=len-1;i>=0;i--){
            for(int d=Math.min(es[i].end,curDay);d>=es[i].start;d--){
                if(days[d]==0){
                    days[d]=1;
                    count++;
                    curDay=d;
                    break;
                }
            }
        }
        return count;
    }
    class event implements Comparable {
        int start;
        int end;
        public event(int start,int end){
            this.start=start;
            this.end=end;
        }

        @Override
        public int compareTo(Object o) {

            event e1=(event)o;
            if(e1.start>this.start){
                return -1;
            }else if(e1.start<this.start){
                return 1;
            }else{
                return this.end-e1.end;
            }
        }
    }

    public static void main(String[] args) {
    }
}
