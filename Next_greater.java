// Optimised Approach TC: O(n+m) SC: O(n)
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            if(st.isEmpty() || st.peek()>nums2[i]){
                st.push(nums2[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()<nums2[i]){
                    map1.put(st.pop(),i);
                }
                st.push(nums2[i]);
            }
        }
        
        while(!st.isEmpty()){
            map1.put(st.pop(),-1);
        }
        System.out.println("Stack"+map1);
        int ans[]=new int[nums1.length];
        int k=0;
        Arrays.fill(ans,-1);
        for(int i:nums1){
            if(map1.get(i)!=-1)
            ans[k]=nums2[map1.get(i)];
            k++;
        }
        return ans;
    }
}
