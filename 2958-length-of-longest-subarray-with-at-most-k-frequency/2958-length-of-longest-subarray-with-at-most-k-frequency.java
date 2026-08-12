class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();


        // for(int ele : nums){
        //     freq.put(ele,freq.getOrDefault(ele,0)+1);
        // } 

        int n = nums.length;

        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;

        while(right<n){
            int ele = nums[right++];
            freq.put(ele,freq.getOrDefault(ele,0)+1);

            while(freq.get(ele) > k){
                int leftele = nums[left];
                freq.put(leftele, freq.get(leftele)-1);
                left++;
            }

            if((right-left)  > max){
                max = right-left;
            }
            System.out.println(left+""+right);
        }

        return max;
    }
}