class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0;
        int end = n - 1;
        int water = 0, maxWater = 0;

        while (start < end) {
            int n1, n2;
            n1 = height[start];
            n2 = height[end];
            water = Math.min(n1, n2) * (end - start);
            if (water > maxWater)
                maxWater = water;
            if (n1 < n2) {
                start++;
            } else {
                end--;
            }
        }

        return maxWater;
    }
}