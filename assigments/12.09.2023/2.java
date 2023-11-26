import java.util.Arrays;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int l = 0;
     ListNode A = new ListNode(l);
     ListNode B = A;
     int total = 0, c = 0;

     while (l1 != null || l2 != null) {
         total = 0;
         if (l1 != null) {
             total += l1.val;
             l1 = l1.next;
         }
         if (l2 != null) {
             total += l2.val;
             l2 = l2.next;
         }
         total += c;
         c = total/10;
         l = total % 10;
         B.next = new ListNode(l);
         B = B.next;
     }
     if (c != 0) {
         B.next = new ListNode(c);
     }
     return A.next;
    }
}