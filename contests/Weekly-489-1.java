// Brute Force TC: O(n) SC: O(n)
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> nums) {
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i:nums){
            if(ts.contains(i)){
                ts.remove(i);
            }
            else
            ts.add(i);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i:ts){
            ans.add(i);
        }
        return ans;
    }
}
// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
       
        boolean[] on = new boolean[101]; 
        
        for (int b : bulbs) {
            on[b] = !on[b];
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (on[i]) {
                result.add(i);
            }
        }
    
        return result;
    }
}
