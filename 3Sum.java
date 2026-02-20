// Optimised approach TC: O(n*n) SC: O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int target=nums[i];
           int start=i+1;
           int end=nums.length-1;
           if (i > 0 && nums[i] == nums[i - 1]) continue;

           while(start<end){
            if(target+nums[start]+nums[end]==0)
            {
                List<Integer> temp=new ArrayList<>();
                temp.add(target);
                temp.add(nums[start]);
                temp.add(nums[end]);
                ans.add(new ArrayList<>(temp));
                while (start < end && nums[start] == nums[start + 1]) {
                        start++;
                    }
                    while (start < end && nums[end] == nums[end - 1]) {
                        end--;
                    }
                start++;
                end--;
            }
            else if(target+nums[start]+nums[end]<0){
                start++;
            }
            else{
                end--;
            }
           }
        }
        return ans;
        }
    }
