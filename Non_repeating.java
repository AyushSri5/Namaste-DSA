// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int count=0;
        int ans=0;
        int freq[]=new int[128];
        int i=0;
        int j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            freq[ch]++;
            while(freq[ch]>1){
                freq[s.charAt(i)]--;
                i++;
            }
            
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}
