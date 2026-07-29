class Solution {
    boolean isVowel(char c){
        return "aeiou".indexOf(c) != -1;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int freq[] = new int[n];

        int res[] = new int[queries.length];

        int count = 0;
        int idx = 0;
        for(String word : words){
            int len = word.length();
            if(isVowel(word.charAt(0)) && isVowel(word.charAt(len-1))){
                count++;
            }
            freq[idx++] = count;
        }

        idx=0;
        for(int ar[]: queries){
            if(ar[0]==0){
            res[idx++] = freq[ar[1]];
            continue;
            }
            int cnt = freq[ar[1]] - freq[ar[0]-1];
            res[idx++] = cnt;
        }

        return res;

    }
}