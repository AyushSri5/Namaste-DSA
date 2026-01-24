// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public int maxProfit(int[] nums) {
        int profit=0;
        int buy=nums[0];
        for(int i:nums){
            if(i<buy){
                buy=i;
            }
            else{
                profit=Math.max(profit,i-buy);
            }
        }
        return profit;
    }
}
