class MyQueue {
// creat argument / veriables
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
        
    public MyQueue() {
      
    }
    
    public void push(int x) {
       if(stack1.isEmpty()){
           stack1.push(x);  // pushing in stack1
           return;
       }        
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop()); // first Popping in stack1 then pushing stack1's pop value in stack2
            // stack1.pop();
        }
        stack1.push(x);
        while(!stack2.empty()){
            stack1.push(stack2.pop()); // first Popping in stack2 then pusing stack2's pop value in stack1
            // stack2.pop();
        }
    }
    
    public int pop() {
        return stack1.pop(); // Popping in stack1 
    }
    
    public int peek() {
        return stack1.peek();
    }
    
    public boolean empty() {
       return stack1.isEmpty() && stack2.isEmpty();   
    }
}