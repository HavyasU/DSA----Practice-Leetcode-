class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : nums) queue.offer(ele);
        for(int i=0;i<k-1;i++) queue.poll();
        return queue.poll();
    }
}