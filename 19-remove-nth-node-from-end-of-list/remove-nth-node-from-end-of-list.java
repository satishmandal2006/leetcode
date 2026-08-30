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
        int size=Size(head);
        if(size == n){
            head=head.next;
            return head;
        }
        int i=1;
        int iToFind=size-n;
        ListNode prev=head;
        while(i < iToFind){
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return head;
    }

    public static int Size(ListNode head){
        int i=0;
        while(head != null){
            head=head.next;
            i++;
        }
        return i;
    }
}