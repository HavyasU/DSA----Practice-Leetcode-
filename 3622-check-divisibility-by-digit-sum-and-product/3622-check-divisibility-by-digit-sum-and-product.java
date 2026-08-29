class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;

        int dsum = 0;
        int psum = 1;

        while(n>0){
            int d = n%10;
            dsum+=d;
            psum*=d;
            n=n/10;
        }

        return num % (dsum+psum)==0;
    }
}