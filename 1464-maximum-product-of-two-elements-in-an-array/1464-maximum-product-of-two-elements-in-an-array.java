class Solution {
    public int maxProduct(int[] nums) {
        int max=-999;
        int secmax=-999;

        int n = nums.length;

        for(int ele:nums){
            if(ele >= max){
                secmax = max;
                max = ele;
            }else if(ele < max && ele>secmax){
                secmax = ele;
            }
        }

        return (max-1)*(secmax-1);
    }
}