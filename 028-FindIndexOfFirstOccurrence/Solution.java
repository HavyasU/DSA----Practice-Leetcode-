class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        int count = 0;
        for (int i = 0; i <= m - n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (haystack.charAt(i + j) == needle.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == n) {
                return i;
            }
        }
        return -1;
    }

}