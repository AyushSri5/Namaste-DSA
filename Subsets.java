// Optimised approach TC: O(N) SC: O(N) Stack Space
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        sub(nums,new ArrayList<>(),0);
        return ans;
    }
    List<List<Integer>> ans=new ArrayList<>();
    public void sub(int nums[],List<Integer> temp,int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        sub(nums,temp,i+1);
        temp.remove(temp.size()-1);
        sub(nums,temp,i+1);
    }
}
