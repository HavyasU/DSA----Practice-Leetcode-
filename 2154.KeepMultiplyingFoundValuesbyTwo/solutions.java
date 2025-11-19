class Solution {
    public int findFinalValue(int[] nums, int original) {
    HashSet<Integer> lst = new HashSet<>();
    for(int n : nums){
        lst.add(n);
    }


    while(lst.contains(original))
        original = original*2;
    return original;
    }
}