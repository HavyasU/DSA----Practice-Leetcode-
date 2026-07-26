class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxfreq = -1;
        for(int ele : arr) {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele : arr){
            if(ele == map.get(ele)){
                if(ele  > maxfreq){
                    maxfreq = ele;
                }
            }
        }

        return maxfreq;

    }
}