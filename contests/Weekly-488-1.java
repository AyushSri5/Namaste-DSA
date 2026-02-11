// FIRST Question 
//Brute Force TC: O(n) SC: O(n)
class Solution {
    public int dominantIndices(int[] nums) {
        int suffix[]=new int[nums.length];
        suffix[nums.length-1]=nums[nums.length-1];
        int sum=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            
            suffix[i]=(nums[i]+sum)/(nums.length-i);
            sum+=nums[i];
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>suffix[i+1])
            count++;
        }
        return count;
    }
}
// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public int dominantIndices(int[] a) {
        int n = a.length;
        long sum = 0;
        int cnt = 0;

        for (int i = n - 1; i > 0; i--) {
            sum += a[i];
            if (a[i - 1] > sum / (n - i)) {
                cnt++;
            }
        }
        return cnt;
    }
}
