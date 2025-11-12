class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            lst.add(nums1[i]);
        }

        for (int i = 0; i < n; i++) {
            lst.add(nums2[i]);
        }

        Collections.sort(lst);

        for (int i = 0; i < m + n; i++) {
            nums1[i] = lst.get(i);
        }
    }
}