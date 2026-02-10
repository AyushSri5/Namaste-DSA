// Optimised solution TC: O(n) SC: O(n)
class Solution {
    public String removeOuterParentheses(String s) {
    int depth=0;
     String ans="";
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            depth++;
            if(depth>1)
            ans+=ch;
        }
        else{
            depth--;
            if(depth>0){
                ans+=ch;
            }
        }
     }
     return ans;   
    }
}
