class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for(int ele : nums){
            hs.add(ele);
        }
        int num = k;
        while(true){
            if(!hs.contains(num)){
                return num;
            }
            num = num+k;
        }

        
    }
}