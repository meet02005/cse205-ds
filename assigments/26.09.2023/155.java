class MinStack {
    Stack<Integer> S;
    Stack<Integer> minstack;
    public MinStack() {
        S = new Stack<Integer>();
        minstack = new Stack<Integer>();
    }
    
    public void push(int val) {
        S.push(val);
        if (minstack.isEmpty() || val <= minstack.peek()) {
            minstack.push(val);
        }
    }
    
    public void pop() {
        int y = S.pop();
        if (minstack.peek() == y) {
            minstack.pop();
        }
    }
    
    public int top() {
        return S.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */