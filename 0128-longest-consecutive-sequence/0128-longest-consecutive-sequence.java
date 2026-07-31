class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        HashSet<Integer> hs = new HashSet<>();
        for(int ele : nums){
            hs.add(ele);
            if(ele < min) min = ele;
            if(ele > max) max = ele;
        }

        int len = 0;
        for(int ele : hs){
            if(!hs.contains(ele-1)){
                int start = ele;
                while(hs.contains(start)){
                    start++;
                }
                if(len < (start-ele)){
                    len =(start-ele);
                }
            }
        }
        return len;
    }
}