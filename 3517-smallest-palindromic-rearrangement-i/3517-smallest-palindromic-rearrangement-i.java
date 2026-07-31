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
            freq[i] = freq[i]/2;
        }
        if(mid!='\000')
        sb.append(mid);

        for(int i=26-1;i>=0;i--){
            for(int j=freq[i];j>0;j--){
                sb.append((char)(i + 'a'));
            }
            freq[i]/=2;
        }

        // return sb.toString() + sb.reverse().toString();
        return sb.toString();

    }
}