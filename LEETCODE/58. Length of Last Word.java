class Solution {
    public int lengthOfLastWord(String s) {
        String[] sentences = s.split(" ");
        int lastWordLength = sentences.length -1;
        String LastWord = sentences[lastWordLength];

        return LastWord.length();
    }
}