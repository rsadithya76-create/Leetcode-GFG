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
    public ListNode reverseList(ListNode head) {
        int length=0;
        ListNode cur=head;
        ListNode pre=null;
        ListNode prepre=null;
        while(cur!=null){
            pre=cur;
            cur=cur.next;
            pre.next=prepre;
            prepre=pre;
        }
        return prepre;
    }
}