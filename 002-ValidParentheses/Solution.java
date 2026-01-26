class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if(s.length() % 2 != 0) return false;

        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            Character match = null;

            if(c == '}' || c==']' || c==')'){
            if(stack.isEmpty()) return false;
               switch(c){20. Valid Parentheses
                case '}' : match = '{';break;
                case ']' : match = '['; break;
                case ')' : match = '(';break; 
               }

                if(stack.pop() != match){
                return false;
               }
            }else{
                stack.push(c);
            }
        }

        if(stack.size() >=1 ){
            return false;
        }

        return true;
    }
}