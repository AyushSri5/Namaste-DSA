// Brute force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(j!=i && (nums[i]+nums[j])==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}
// Hashmap TC: O(n) SC: O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[1]=i;
                ans[0]=map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
