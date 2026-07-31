class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int len=1, maxlen=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]+1 || nums[i]==nums[i-1]){
                if( nums[i]!=nums[i-1])len++;
            }else{
                len = 1;
            }
            if(len > maxlen) maxlen = len;
        }
        return maxlen;
    }
}