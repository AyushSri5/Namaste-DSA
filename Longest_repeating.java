// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int ans=0;
        int maxf=0;
        int freq[]=new int[26];
        while(j<s.length()){
                freq[s.charAt(j)-'A']++;
                maxf=Math.max(maxf,freq[s.charAt(j)-'A']);
                while(((j-i+1)-maxf)>k){
                    freq[s.charAt(i)-'A']--;
                    i++;
                }
                ans=Math.max(ans,(j-i+1));
                j++;
        }
        return ans;
    }
}
