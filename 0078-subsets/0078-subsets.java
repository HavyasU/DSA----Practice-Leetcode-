class Solution {
    List<List<Integer>> sub = new ArrayList<>();
    List<Integer> current = new ArrayList<>();

    void DFS(int[] nums,  int index, List<Integer> current){
        if(index == nums.length){
            sub.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index++]);
        DFS(nums, index, current);
        current.remove(current.size() -1);
        DFS(nums, index++, current);
    }
    public List<List<Integer>> subsets(int[] nums) {
        DFS(nums,0,current);
        return sub;
    }
}