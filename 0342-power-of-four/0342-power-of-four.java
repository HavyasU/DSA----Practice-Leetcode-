class Solution {
    public boolean isPowerOfFour(int n) {
        int i=n;
        for(;i>1;i/=4){
            if(i%4!=0) return false;
        }
        return (i==1);
    }
}