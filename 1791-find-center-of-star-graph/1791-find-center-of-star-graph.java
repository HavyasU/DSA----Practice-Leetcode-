class Solution {
    public int findCenter(int[][] edges) {
        int ele=-1;
        int count = 0;
        for(int arr[] : edges){
            for(int cur : arr)
            {
                    if(ele == cur){
                        count++;
                    }else{
                        count--;
                    }
                    if(count <= 0){
                        ele = cur;
                        count = 1;
                    }
            }
        }
        return ele;
    }
}