// Optimised Force TC: O(n) SC: O(n)
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> ls=new ArrayList<>();
        Stack<Long> st=new Stack<>();

        for(int i=0;i<nums.length;i++){
            long num=nums[i];
            if(st.isEmpty()){
                st.push(num);
            }
            else {
                long sum=num;
                while(!st.isEmpty() && st.peek()==sum){
                    sum+=st.peek();
                    st.pop();
                }
                st.push(sum);
            }
        }
        while(!st.isEmpty()){
            ls.add(0,st.pop());
        }
        return ls;
    }
}
