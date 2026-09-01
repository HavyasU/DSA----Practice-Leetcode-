class Solution {
    public int lengthOfLongestSubstring(String s) {
        // StringBuilder sb = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();

        int n = s.length();

        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(left<n && right<n){
            if(hs.contains(s.charAt(right))){
                while(hs.contains(s.charAt(right))){
                    hs.remove(s.charAt(left++));
                }
            }else{
                hs.add(s.charAt(right++));
                maxLen = Math.max(maxLen,(right-left));
            }
        }

        return maxLen;

    }
}