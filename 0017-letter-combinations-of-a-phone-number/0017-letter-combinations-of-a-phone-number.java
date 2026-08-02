class Solution {
    HashMap<Integer, String> map = new HashMap<>();

   

    int n;
    String digits;
    ArrayList<String> lst = new ArrayList<>();

    void DFS(int index, StringBuilder sb){
        if(index == n){
            lst.add(sb.toString());
            return;
        }
        String str = map.get((digits.charAt(index)-'0'));
        for(char c : str.toCharArray()){
            sb.append(c);
            DFS(index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        this.digits = digits;
        this.n  = digits.length();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        DFS(0, new StringBuilder());
        return lst;
    }
}