class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> freq = new HashMap<>();

        for(String word  : words){
            freq.put(word,freq.getOrDefault(word,0)+1);
        }

        Queue<String> queue = new PriorityQueue<>((a,b)->{

            if(freq.get(b)!=freq.get(a))
            return freq.get(b)-freq.get(a);

            return a.compareTo(b);
            }
        );


        for(String word : freq.keySet()){
            queue.offer(word);
        }


        ArrayList<String> lst = new ArrayList<>();
        
        for(int i=1;i<=k;i++){
            lst.add(queue.poll());
        }

        return lst;

    }
}