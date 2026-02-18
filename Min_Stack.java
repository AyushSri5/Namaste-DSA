// Brute Force TC : O(1) SC: O(n)
class MinStack {
    Stack<Pair> st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new Pair(val,val));
        }
        else{
            st.push(new Pair(val,Math.min(val,st.peek().y)));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().x;
    }
    
    public int getMin() {
        return st.peek().y;
    }
}
class Pair{
    int x;
    int y;
    public Pair(int a,int b){
        x=a;
        y=b;
    }
}
// Optimised approach TC: O(1) SC: O(1)
class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        long v = val;
        if(st.isEmpty()){
            st.push(v);
            min = v;
        }
        else if(v >= min){
            st.push(v);
        }
        else{
            st.push(2*v - min);
            min = v;
        }
    }
    
    public void pop() {
        long s = st.pop();
        if(s < min){
            min = 2*min - s;
        }
    }
    
    public int top() {
        long n = st.peek();
        if(n >= min)
            return (int)n;
        else
            return (int)min;
    }
    
    public int getMin() {
        return (int)min;
    }
}
