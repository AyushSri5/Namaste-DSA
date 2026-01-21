class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }
    public void sort(int nums[],int s,int e){
        if(s>=e)
        return;
        int L=s;
        int R=e;
        int mid=s+(e-s)/2;
        int pivot=nums[mid];

        while(true){
            while(L<nums.length && nums[L]<pivot){
                L++;
            }
            while(R>=0 && nums[R]>pivot){
                R--;
            }
            if(L<=R){
                int temp=nums[L];
                nums[L]=nums[R];
                nums[R]=temp;
                L++;
                R--;
            }
            else
            break;
        }

        sort(nums,s,R);
        sort(nums,L,e);
    }
}
