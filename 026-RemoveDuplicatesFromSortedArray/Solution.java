class Solution {
    public int removeDuplicates(int[] nums) {
        Integer prevItem = null;
        Integer item = null, k = -1;

        int i = 0;
        while (i < nums.length) {
            item = nums[i];
            if (prevItem != item) {
                nums[++k] = item;
                prevItem = item;
            } else {
                i++;
            }
        }

        return k + 1;

    }
}