// Optimised approach TC: O(N*2^N) SC: O(N*2^N)
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subs(nums,0,new ArrayList<>());
        return ans;
    }
    List<List<Integer>> ans=new ArrayList<>();
    public void subs(int nums[],int j,List<Integer> temp){
        
            ans.add(new ArrayList<>(temp));

        for(int i=j;i<nums.length;i++){
            if(i>j && nums[i]==nums[i-1])
            continue;
        temp.add(nums[i]);
        subs(nums,i+1,temp);
        temp.remove(temp.size()-1);
        }
       
    }
}
