// Brute Force TC: O(n*n) SC: O(1)
class Solution {
    public int maxArea(int[] height) {
        int max = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int h = Math.min(height[i], height[j]);
                int w = j - i;
                int area = h * w;
                max = Math.max(max, area);
            }
        }

        return max;
    }
}
// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=0;
        while(left<right){
            int water=Math.min(height[left],height[right])*(right-left);
            ans=Math.max(ans,water);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}
