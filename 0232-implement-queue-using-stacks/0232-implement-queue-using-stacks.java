class MyQueue {
    Stack<Integer> main; 
    Stack<Integer> aux;

    public MyQueue() {
        main = new Stack<>();
        aux = new Stack<>();
    }
    
    public void push(int x) {
        aux.push(x);
    }
    
    public int pop() {
        if(main.isEmpty()){
            while(!aux.isEmpty()){
                main.push(aux.pop());
            }
        }

        return main.pop();
    }
    
    public int peek() {
        if(main.isEmpty()){
            while(!aux.isEmpty()){
                main.push(aux.pop());
            }
        }
        return main.peek();
    }
    
    public boolean empty() {
        return main.isEmpty() && aux.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */