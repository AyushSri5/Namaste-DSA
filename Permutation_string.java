// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        return false;

        int freq[]=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            freq[s2.charAt(i)-'a']--;
        }
        boolean first=true;
        for(int i:freq){
            if(i!=0)
            flag=false;
        }
        if(first){
            return true;
        }
        for(int j=s1.length();j<s2.length();j++){
            freq[s2.charAt(j-s1.length())-'a']++;
            freq[s2.charAt(j)-'a']--;
            boolean flag=true;
            for(int i:freq){
            if(i>0)
            flag=false;
        }
        if(flag)
        return true;
        }
        return false;
    }
}
