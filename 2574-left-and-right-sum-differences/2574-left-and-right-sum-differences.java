class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;;
        int pre[]=new int[n];
        int suf[]=new int[n];
        int ans[]=new int[n];

        int sum = 0;
        for(int i=0;i<n;i++){
            pre[i] = sum;
            sum+=nums[i];
        }

        sum = 0;
        for(int i=n-1;i>=0;i--){
            suf[i] = sum;
            sum+=nums[i];
        }   

        for(int i=0;i<n;i++){
            ans[i] = Math.abs(pre[i]-suf[i]);
        }



        return ans;
    

    }
}