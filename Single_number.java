// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i:nums){
            ans=ans^i;
        }
        return ans;
    }
}
