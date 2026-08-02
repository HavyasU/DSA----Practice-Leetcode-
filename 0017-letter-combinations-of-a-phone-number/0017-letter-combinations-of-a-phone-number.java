class Solution {
    HashMap<Integer, String> map = new HashMap<>();
    String[] keys = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    void DFS(String digits, int index, StringBuilder sb, ArrayList<String> result){
        if(index == digits.length()){
            result.add(sb.toString());
            return;
        }
        String str = keys[digits.charAt(index)-'0'];
        for(char c : str.toCharArray()){
            sb.append(c);
            DFS(digits, index+1, sb, result);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        ArrayList<String> result = new ArrayList<>();
        if(digits.isEmpty()) return result;        

        DFS(digits, 0, new StringBuilder(), result);
        return result;
    }
}