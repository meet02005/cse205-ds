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
    public ListNode insertionSortList(ListNode head) {
        ListNode A = new ListNode(-10000);
        A.next = head;
        ListNode pre = A;
        ListNode cur = head;

        while (cur != null) {
            if (cur.val >= pre.val) {
                pre = cur;
                cur = cur.next;
            }
            else {
                ListNode T = A;
                while (T.next.val < cur.val) {
                    T = T.next;
                }
                pre.next = cur.next;
                cur.next = T.next;
                T.next = cur;
                cur = pre.next;
            }
        }
        return A.next;
    }
}