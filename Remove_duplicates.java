// Brute Force TC: O(n) SC: O(n)
class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        int k=0;
        for(int i:map.keySet()){
            nums[k++]=i;
        }
        return k;
    }
}
//Optimised approach TC: O(n) SC: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
        return 0;

        int i=1;

        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i-1]){
                nums[i]=nums[j];
                i++;
            }
        }

        return i;
    }
}
