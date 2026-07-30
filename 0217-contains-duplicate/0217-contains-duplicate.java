class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int ele : nums){
            if(!hs.add(ele)) return true;
        }

        return false;
    }
}