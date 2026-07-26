class Solution {
    public int maxProduct(int n) {
        char chars[] = String.valueOf(n).toCharArray();
       Arrays.sort(chars);
       n = chars.length;
       return (int)(chars[n-1]-'0')* (int)( chars[n-2]-'0');
    }
}