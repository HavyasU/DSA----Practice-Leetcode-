class Solution {
    List<String> lst = new ArrayList<>();
    int n;
    void DFS(String s, int index, StringBuilder sb){
        if(index == n){
            lst.add(sb.toString());
            return;
        }
        char ch = s.charAt(index++);
        if(Character.isLetter(ch)){
            sb.append(Character.toUpperCase(ch));
            DFS(s, index,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append(Character.toLowerCase(ch));
        DFS(s, index,sb);
        sb.deleteCharAt(sb.length()-1);
    }
    public List<String> letterCasePermutation(String s) {
        n = s.length();
        s = s.toLowerCase();
        DFS(s, 0, new StringBuilder());
        return lst;
    }
}