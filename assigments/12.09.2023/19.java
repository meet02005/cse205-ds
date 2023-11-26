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
        ListNode s = new ListNode();
        s.next = head;
        ListNode head1 = s;
        ListNode head2 = s;

        for (int i = 0; i<n; i++) {
            head2 = head2.next;
        }
        while (head2.next != null) {
            head1 = head1.next;
            head2 = head2.next;
        }
        head1.next = head1.next.next;
        return s.next;

    }
}