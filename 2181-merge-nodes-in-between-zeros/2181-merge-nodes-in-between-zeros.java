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


       ListNode res=new ListNode(0);
       ListNode tail = res;
       
       int sum =0;
       while(temp!=null){
        if(temp.val != 0){
            sum+=temp.val;
        }else{
            tail.next = new ListNode(sum);
            tail = tail.next;
            sum = 0;
        }
        temp = temp.next;
       }

        res = res.next;
       return  res;
    }
}