// Optimised approach TC: O(n) SC: O(n)
class MyStack {
    Queue<Integer> qu1;
    int size=0;
    public MyStack() {
        qu1=new LinkedList<>();
    }
    
    public void push(int x) {
        qu1.add(x);
        int end=qu1.size()-1;
        while(end-->0){
            qu1.add(qu1.poll());
        }

    }
    
    public int pop() {
        return qu1.poll();
    }
    
    public int top() {
        return qu1.peek();
    }
    
    public boolean empty() {
        return qu1.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
