class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        int lprod = 1, rprod = 1;

        for (int i = 0; i < n; i++) {
            lprod *= nums[i];
            rprod *= nums[n - i - 1];
            left[i] = lprod;
            right[n - 1 - i] = rprod;
        }

        for (int i = 0; i < n; i++) {
            int l = i > 0 ? left[i - 1] : 1;
            int r = i + 1 < n ? right[i + 1] : 1;
            ans[i] = l * r;
        }
        return ans;
    }
}