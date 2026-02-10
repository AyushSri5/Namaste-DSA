// Brute Force TC: O(n*n) SC: O(1)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > temperatures[i]) {
                    ans[i] = j - i;
                    break;
                }
            }
        }

        return ans;
    }
}
// Optimised approach TC: O(n) SC: O(n)
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int ans[]=new int[temp.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temp.length;i++){
            if(st.isEmpty() || temp[st.peek()]>=temp[i]){
                st.push(i);
            }
            else{
                while(!st.isEmpty() && temp[st.peek()]<temp[i]){
                    ans[st.peek()]=i-st.peek();
                    st.pop();
                }
                st.push(i);
            }
        }
        return ans;
    }
}
