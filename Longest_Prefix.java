// Optimised approach TC: O(nlog(n)) SC: O(1)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first=strs[0];
        String last=strs[strs.length-1];
        String ans="";
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                ans+=first.charAt(i);
            }
            else
            return ans;
        }
        return ans;
    }
}
