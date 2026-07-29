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
    public ListNode middleNode(ListNode head) {
        int length=0;
        ListNode slow=head;
        ListNode fast=head;
        int n=0;
        while(fast!=null){
           if(fast!=null){
            fast=fast.next;
            n+=1;
            if(n==2){
                slow=slow.next;
                n=0;
            }
           }
           else{
            slow=slow.next;
           }
        }
        return slow;
    }
}