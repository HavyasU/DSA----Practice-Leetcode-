class Solution {
    int sum(int n){
        int s = 1;
        while(n>0){
            int d = n%10;
            s*=d;
            n=n/10;
        }
        return s;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            if(sum(n)%t == 0)
            return n;
            n = n+1;
        }
    }
}