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
    public int numComponents(ListNode head, int[] nums) {
        boolean isCon = false;
        ListNode temp  = head;
        HashSet<Integer> hs = new HashSet();

        for(int ele : nums){
            hs.add(ele);
        }

        int idx = 0;
        int count = 0;
        while(temp!=null){
            if(hs.contains(temp.val)){
                isCon = true;
                idx++;
            }else if(isCon == true){
                isCon = false;
                count++;
            }       
            temp = temp.next;
        }
        if(isCon == true){
                isCon = false;
                count++;
        }   

        return count;
    }
}