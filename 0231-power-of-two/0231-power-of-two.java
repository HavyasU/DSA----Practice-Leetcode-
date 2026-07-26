class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        for(long i=2;i<=n;i*=2){
            if(i==n) return true;
        }
        return false;
    }
}


