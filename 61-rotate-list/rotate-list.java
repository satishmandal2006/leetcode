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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0){
            return head;
        }
        ListNode tail=head;
        int siz=1;
        while(tail.next != null){
            tail=tail.next;
            siz++;
        }
        k=k%siz;
        if(k==0){
            return head;
        }
        tail.next=head;
        int step=siz-k;
        ListNode newTail=head;

        for(int i=1;i<step;i++){
            newTail=newTail.next;
        }

        ListNode newHead=newTail.next;
        newTail.next=null;

        return newHead;

    }
}

//Brout force
// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {

//         if (head == null || head.next == null || k == 0) {
//             return head;
//         }
//         for (int i = 1; i <= k; i++) {

//             ListNode slow = head;
//             ListNode fast = head;
//             while (fast.next != null) {
//                 slow = fast;
//                 fast = fast.next;
//             }
//             slow.next = null;
//             fast.next = head;
//             head = fast;
//         }

//         return head;
//     }
// }