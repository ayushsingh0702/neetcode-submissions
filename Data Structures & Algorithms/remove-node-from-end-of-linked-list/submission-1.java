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

        if(head==null || head.next ==null){
            return null;
        }
        // fins the length of the linkedList
        int length = 0;
        ListNode temp = head;

        while(temp!=null){
            temp = temp.next;
            length=length+1;
        }

        temp = head;

        int pos = length-n;
        int i=0;
        ListNode prev = null;
        ListNode curr = head;

        while(i<pos){
            prev=curr;
            curr= curr.next;
            i=i+1;
        }
        // if(curr==null){
            // prev.next = null;
        // }
        // else{
        if(prev==null){
            return head.next;
        }
          prev.next = curr.next;
        // }
        return head;
        
    }
}
