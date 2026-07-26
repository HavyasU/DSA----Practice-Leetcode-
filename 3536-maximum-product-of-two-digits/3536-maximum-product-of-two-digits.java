class Solution {
    public int maxProduct(int n) {
        int max=-999;
        int secmax=max;
        while(n!=0){
            int d = n%10;
            if(d>=max){
                secmax =max;
                max = d;
            }else if(d<max && d>secmax){
                secmax = d;
            }
            n = n/10;
        }

        return max*secmax;
    }
}