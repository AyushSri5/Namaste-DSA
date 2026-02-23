// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public int scoreDifference(int[] nums) {
        int first=0;
        int second=0;
        int active1=1;
        int active2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0 ){
                active1=1-active1;
                active2=1-active2;
            }
            if((i+1)%6==0){
                 active1=1-active1;
                active2=1-active2;
            }
            if(active1==1){
                
                first+=nums[i];
            }
            if(active2==1){
                
                second+=nums[i];
            }
        }
        return first-second;
    }
}
