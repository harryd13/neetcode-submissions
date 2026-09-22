class Solution {
    public boolean isValid(String s) {
        int l = s.length();
        if(l%2 !=0) return false;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if(c == '{' || c == '(' || c == '['){
                stack.push(c);
            }
            else{
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                boolean condition = (top == '{' && c == '}') ||
                    (top == '[' && c == ']') || (top == '(' && c == ')');
                    
                if(!condition){
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
        
    }
}
