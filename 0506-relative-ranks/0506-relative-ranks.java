class Solution {
    public String[] findRelativeRanks(int[] score) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int s : score){
            queue.offer(s);
        }

        HashMap<Integer,Integer> sheet = new HashMap<>();
        int place  = 1;
        while(!queue.isEmpty()){
          sheet.put(queue.poll(), place++);  
        }

        List<String> lst = new ArrayList<>();
        for(int ele : score){
            int rank = sheet.get(ele);
            if(rank==1){
                lst.add("Gold Medal");
            }else if(rank==2){
                lst.add("Silver Medal");
            }else if(rank==3){
                lst.add("Bronze Medal");
            }else{
                lst.add(String.valueOf(rank));
            }
        }

        return lst.toArray(new String[0]) ;

        

    }
}