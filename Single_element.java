// Optimised approach TC: O(log(n)) SC: O(1)
class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>0 && nums[mid]==nums[mid-1]){
                if(mid%2==1){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else if(mid<nums.length-1 && nums[mid]==nums[mid+1]){
                if(mid%2==0){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else
            return nums[mid];
        }
        return -1;
    }
}
