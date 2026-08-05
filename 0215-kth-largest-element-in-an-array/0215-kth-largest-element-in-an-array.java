class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for(int ele : nums) {
            queue.offer(ele);
            if(queue.size()>k) queue.poll();
        }
        return queue.poll();
    }
}