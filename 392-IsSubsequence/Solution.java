class Solution {
    public boolean isSubsequence(String s, String t) {
        int sindex = 0;
        int sn = s.length();
        int tindex = 0;
        int tn = t.length();

        while (sindex < sn && tindex < tn) {
            if (s.charAt(sindex) == t.charAt(tindex)) {
                sindex++;
            }
            tindex++;
        }
        return sindex == sn;

    }
}