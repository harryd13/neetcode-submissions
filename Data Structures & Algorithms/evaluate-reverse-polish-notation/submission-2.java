class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for(String token : tokens){
            if(isOperator(token)){
                int right =  s.pop();
                int left = s.pop();
                int result;

                switch(token){
                    case "+":
                        result = left + right;
                        break;
                    case "-":
                        result = left - right;
                        break;
                    case "*":
                        result = left * right;
                        break;
                    default:
                        result = left / right;
                        
                }
                s.push(result);
            }else{
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
        
    }
    public boolean isOperator(String token){
        if(token.equals("+")||
          token.equals("-")||
          token.equals("*")||
          token.equals("/")){
            return true;
        }
        return false;
    }
}
