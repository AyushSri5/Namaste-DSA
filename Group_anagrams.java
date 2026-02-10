// Optimised approach TC: O(n*m) SC: O(n*m)
class Solution {
    public int[] nextGreaterElements(int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[nums2.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<2*nums2.length;i++){
            int index=i%nums2.length;
            if(st.isEmpty() || nums2[st.peek()]>nums2[index]){
                st.push(index);
            }
            else{
                while(!st.isEmpty() && nums2[st.peek()]<nums2[index]){
                    ans[st.peek()]=nums2[index];
                    st.pop();
                }
                st.push(index);
            }
        }
        return ans;
    }
}
