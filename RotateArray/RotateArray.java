class Solution {

    public void rotateByK(int num[], int start, int end) {
        while (start <= end) {
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k > n)
            k = k % n;
        rotateByK(nums, 0, n - 1);
        rotateByK(nums, 0, k - 1);
        rotateByK(nums, k, n - 1);
    }
}