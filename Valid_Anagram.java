// Brute Force TC: O(n) SC: O(n)
class Solution {
    public int balancedStringSplit(String s) {
        int ans=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')
            ans++;
            else
            ans--;
            if(ans==0)
            count++;
        }
        return count;
    }
}
// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        // HashMap<Character,Integer> map=new HashMap<>();
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            int ch=(int)s.charAt(i)-97;
            // if(map.containsKey(ch)){
            //     map.put(ch,map.get(ch)+1);
            // }
            // else{
            //     map.put(ch,1);
            // }
            arr[ch]++;
        }
        for(int i=0;i<t.length();i++){
            int ch=(int)t.charAt(i)-97;
            // if(map.containsKey(ch)){
            //     map.put(ch,map.get(ch)-1);
            //     if(map.get(ch)==0){
            //         map.remove(ch);
            //     }
            // }
            if(arr[ch]>0){
                arr[ch]--;
            }
            else 
            return false;
        }
        return true;
    }
}
