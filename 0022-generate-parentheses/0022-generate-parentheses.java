class Solution {
    void DFS(int n, StringBuilder sb, int left, int right,ArrayList<String> result){

        if(left == n  && right == n){
            result.add(sb.toString());
            return;
        }   
        
        if(left < n){
            sb.append('(');
            DFS(n, sb, left+1, right, result);
            sb.deleteCharAt(sb.length()-1);
        }
        
        if(right < left){
            sb.append(')');
            DFS(n, sb, left, right+1, result);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>(); 
        DFS(n, new StringBuilder(), 0, 0, result);
        return result;
    }
}