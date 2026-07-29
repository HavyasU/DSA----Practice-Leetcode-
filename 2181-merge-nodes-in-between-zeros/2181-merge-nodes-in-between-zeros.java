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
    public ListNode mergeNodes(ListNode head) {
       ListNode temp = head.next;

       ListNode res = null;
       ListNode tail = null;
       
       int sum =0;
       while(temp!=null){
        if(temp.val != 0){
            sum+=temp.val;
        }else{
            ListNode dummy = new ListNode(sum);
            dummy.next = null;
            if(tail == null){
                tail = dummy;
                res = tail;
            }else{
                tail.next = dummy;
                tail = tail.next;
            }
            sum=0;
        }
        temp = temp.next;
       }
       return res; 
    }
}