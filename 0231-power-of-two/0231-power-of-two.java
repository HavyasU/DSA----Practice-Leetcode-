class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=n;
        for(;i>1;i/=2){
            if(i%2!=0) return false;
        }
        return i==1;
    }
}


