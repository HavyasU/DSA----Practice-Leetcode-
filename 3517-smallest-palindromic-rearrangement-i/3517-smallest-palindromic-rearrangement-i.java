class Solution {
    public String smallestPalindrome(String s) {
        int freq[]= new int[26];
        int n = s.length();

        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }


        StringBuilder sb = new StringBuilder();
        char mid = '\000';
        for(int i=0;i<26;i++){
            for(int j=0;j<(freq[i]/2);j++){
                sb.append((char)(i + 'a'));
            }
            if(freq[i] % 2 == 1){
                mid = (char)(i + 'a');
                freq[i]--;
            }
        }

        String left = sb.toString();
        String right = sb.reverse().toString();

        if(mid!='\000')
        left += mid;
        



        // return sb.toString() + sb.reverse().toString();
        return left+right;

    }
}