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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        ListNode left = list1;
        ListNode right = list2;

        while(left!=null && right!=null){
            if(left.val <= right.val){
                res.next = new ListNode(left.val);
                left = left.next;
            }else{
                res.next = new ListNode(right.val);
                right = right.next;
            }
            res = res.next;
        }

        while(left!=null){
            res.next = new ListNode(left.val);
            res = res.next;
            left = left.next;
        }

        while(right!=null){
            res.next = new ListNode(right.val);
            res = res.next;
            right = right.next;
        }

        head = head.next;
        return head;
    }
}