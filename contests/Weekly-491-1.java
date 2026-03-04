// Optimised approach TC: O(n) SC: O(n)
class Solution {
    public String trimTrailingVowels(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            st.push(ch);
        }
        while(!st.isEmpty() && isVowel(st.peek())){
            st.pop();
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
