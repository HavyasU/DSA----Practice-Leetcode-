package LEETCODE.Word-pattern;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> pmap = new HashMap<>();
        HashMap<String, Character> smap = new HashMap<>();
        String[] sa = s.split(" ");
        if (sa.length != pattern.length())
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            Character c = pattern.charAt(i);
            if (pmap.containsKey(c)) {
                if (!pmap.get(c).equals(sa[i])) {
                    return false;
                }
            }
            if (smap.containsKey(sa[i])) {
                if (!smap.get(sa[i]).equals(c))
                    return false;
            }

            pmap.put(c, sa[i]);
            smap.put(sa[i], c);
        }
        return true;
    }
}.java{

}
