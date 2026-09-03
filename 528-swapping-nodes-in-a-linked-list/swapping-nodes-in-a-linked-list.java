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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int siz=0;
        while(temp != null){
            temp=temp.next;
            siz++;
        }

        ListNode first=head;
        int i=0;
        while(i<k-1){
            first=first.next;
            i++;
        }

        ListNode second=head;
        int idx=siz - k + 1;
        int j=0;
        while(j < idx -1){
            second=second.next;
            j++;
        }

        int temp2=first.val;
        first.val=second.val;
        second.val=temp2;

        return head;
    }
}