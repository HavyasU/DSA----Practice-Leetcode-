class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int start = 0, end = sb.length() - 1; start < end; start++, end--) {
            char str = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, str);
        }
        return sb.toString().trim();
    }

    public String reverseWords(String s) {

        String strng = reverseString(s);
        String ans = "";
        for (String word : strng.split(" ")) {
            if (word.length() == 0) {
                continue;
            }
            String revWord = reverseString(word.trim());
            ans = ans + revWord + " ";
        }

        return ans.trim();
    }
}

class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int start = 0, end = sb.length() - 1; start < end; start++, end--) {
            char str = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, str);
        }
        return sb.toString().trim();
    }

    public String reverseWords(String s) {

        String strng = reverseString(s);
        String ans = "";
        for (String word : strng.split(" ")) {
            if (word.length() == 0) {
                continue;
            }
            String revWord = reverseString(word.trim());
            ans = ans + revWord + " ";
        }

        return ans.trim();
    }
}