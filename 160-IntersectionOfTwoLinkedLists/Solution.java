
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
        ListNode lA = headA;
        ListNode lB = headB;
        while (lA != lB) {
            if (lA == null) {
                lA = headB;
            } else {
                lA = lA.next;
            }
            if (lB == null) {
                lB = headA;
            } else {
                lB = lB.next;
            }
        }

        if (lA != null) {
            return lA;
        } else {
            return null;
        }

    }
}
