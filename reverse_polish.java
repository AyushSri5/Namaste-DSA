// Optimised approach TC: O(n) SC: O(n)
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String local=tokens[i];
            if(local.equals("+") || local.equals("-") || local.equals("*") || local.equals("/")){
                int num1=st.pop();
                int num2=st.pop();
                int ans=0;
                if(local.equals("+")){
                    ans=num2+num1;
                }
                else if(local.equals("-")){
                    ans=num2-num1;
                }
                else if(local.equals("*")){
                    ans=num2*num1;
                }
                else{
                    ans=num2/num1;
                }
                st.push(ans);
            }
            else{
                int num=Integer.parseInt(local);
                st.push(num);
            }
        }
        return st.peek();
    }
}
