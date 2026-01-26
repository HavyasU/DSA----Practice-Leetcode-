class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int first = 0;
        int last = n-1;
        while(first<=last){
            if(nums[last] == val){
                last--;
            }else{
                if(val == nums[first]){
                    nums[first] = nums[last];
                    last--;
                    first++;
                }else{
                     first++;
                }   
            }
        }

        return last+1;
    }
}