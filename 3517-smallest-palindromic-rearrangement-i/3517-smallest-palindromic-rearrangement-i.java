class Solution {
    public String smallestPalindrome(String s) {
        int freq[]= new int[26];
        int n = s.length();

        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }

        System.out.println(Arrays.toString(freq));

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

        if(mid=='\000')
        return sb.toString()+ sb.reverse().toString();
        

        // return sb.toString() + sb.reverse().toString();
        return sb.toString()+mid+ sb.reverse().toString();

    }
}