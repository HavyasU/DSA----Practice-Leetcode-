class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int val =1;
        int sum =0 ;
        while(n>=0){
            if(n<=8){
                sum += (n*val);
            }else{
                sum+=(8*val);
            }
            val++;
            n = n - 8;
        }
        return sum;
    }
}