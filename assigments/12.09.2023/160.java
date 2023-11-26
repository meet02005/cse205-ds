/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int constant1 = 0, constant2 = 0;
        ListNode A1 = headA, A2 = headB;
        while (A1 != null) {
            constant1++;
            A1 = A1.next;
        }
        while (A2 != null) {
            constant2++;
            A2 = A2.next;
        }
        while (constant1 > constant2) {
            constant1--;
            headA = headA.next;
        }
        while (constant2 > constant1) {
            constant2--;
            headB = headB.next;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}