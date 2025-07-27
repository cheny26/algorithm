package LeetCode;

import java.util.*;

/**
 * @author chen_y
 * @date 2025-07-14 8:55
 */
public class LC1290 {
    public int getDecimalValue(ListNode head) {
        int ans=0;
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        for(int i=list.size()-1,p=1;i>=0;i--,p*=2){
            ans+=list.get(i)*p;
        }
        return ans;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
