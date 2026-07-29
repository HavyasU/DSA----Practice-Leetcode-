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
       ListNode temp = head;
       int sum = 0;
       
       while(temp!=null){
        if(temp.next!=null && temp.next.val == 0){
            if(temp.next.next==null){
                temp.next = null;
                temp = temp.next;
            }else{
                temp = temp.next;
            }    
        }else if(temp.next!=null && temp.next.val !=0){
            temp.val+=temp.next.val;
            temp.next = temp.next.next;
        }
       }
       return head; 
    }
}