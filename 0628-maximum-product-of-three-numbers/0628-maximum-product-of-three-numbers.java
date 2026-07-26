class Solution {
    public int maximumProduct(int[] nums) {

        int max = -99999;
        Arrays.sort(nums);
        int n = nums.length;
        int left = nums[0] * nums[1] * nums[n-1];
        int right = nums[n-1] * nums[n-2] * nums[n-3];
        
        return Math.max(left, right);
    }
}