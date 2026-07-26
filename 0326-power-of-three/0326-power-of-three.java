class Solution {
    public boolean isPowerOfThree(int n) {
        for(;n>1;n/=3){
            if(n%3!=0) return false;
        }
        if(n==1) return true;
        return false;
    }
}