// Brute Force TC: O(n) SC: O(n)
class Solution {
    public int missingNumber(int[] nums) {
        // 3 0 1
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int ans=-1;
        for(int i=0;i<=nums.length;i++){
            if(!hs.contains(i)){
                ans=i;
            }
        }
        return ans == -1 ? nums.length: ans;
    }
}
// Optimised approach 1 TC: O(n) SC: O(1)
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum1=n*(n+1)/2;
        int sum2=0;
        for(int i:nums){
            sum2+=i;
        }
        return sum1-sum2;
    }
}
// Optimised approach 2 TC: O(n) SC: O(1)
class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        for(int i=1;i<=nums.length;i++){
            ans=ans^i;
        }
        for(int i:nums){
            ans=ans^i;
        }
        return ans;
    }
}
