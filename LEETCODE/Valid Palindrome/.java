class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            if(Character.isLetterOrDigit(cur)){
                sb.append(Character.toLowerCase(cur));
            }
        }

        for(int i=0;i<sb.length()/2;i++){
            char start = sb.charAt(i);
            char end = sb.charAt(sb.length() - i-1);
            if(start!=end){
                return false;
            }
        }

        return true;
    }
}