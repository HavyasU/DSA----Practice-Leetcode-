class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        List<Integer> lst = new ArrayList<>();
        if(n==0) return  lst;

        HashSet<Integer> hs = new HashSet<>();
        int smallest = nums[0];
        int largest = nums[0];
        for(int ele : nums) {
            if(ele < smallest) smallest = ele;
            if(ele > largest) largest = ele;
            hs.add(ele);
        }

        for(int i = smallest; i<=largest; i++){
            if(!hs.contains(i))
            lst.add(i);
        }

        return lst;
    }
}