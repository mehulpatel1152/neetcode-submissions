/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int idx=0;
        int size=0;

        ListNode prev=null;
        ListNode cur=head;

        while(cur!=null){
            size++;
            cur=cur.next;
        }

        cur=head;
        n=size-n;

        while(cur!=null){
            if(idx==n){
                if(prev==null){
                    return cur.next;
                }else{
                    prev.next=cur.next;
                    cur.next=null;
                    
                    break;
                }
            }else{
                idx++;
                prev=cur;
                cur=cur.next;
            }
        }

        return head;
    }
}
