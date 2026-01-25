// Brute Force TC: O(n) SC: O(n)
class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            if(i!=0){
                list.add(i);
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        for(int i=list.size();i<nums.length;i++){
            nums[i]=0;
        }
    }
}
// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public void moveZeroes(int[] nums) {
        // 1 3 4 5 5 0 0 8 0
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }
    }
}
