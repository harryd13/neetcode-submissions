class MinStack {
    private final Stack<Integer> val ;
    private final Stack<Integer> min;

    public MinStack() {
        val = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int v) {
        val.push(v);
        if(min.isEmpty() || min.peek() >= v){
            min.push(v);
        }

    }
    
    public void pop() {
        int rem = val.pop();
        if(rem == min.peek()){
            min.pop();
        }
    }
    
    public int top() {
        return val.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
