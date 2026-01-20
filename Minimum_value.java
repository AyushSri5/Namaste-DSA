// Prefix Sum TC: O(n) SC: O(1)
class Solution {
    public int minStartValue(int[] nums) {
        int prefix=0;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            prefix+=i;
            min=Math.min(prefix,min);
        }
        return min<0 ? Math.abs(min)+1 : 1;
    }
}
