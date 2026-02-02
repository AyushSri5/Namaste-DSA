// Brute Force TC: O(n) SC: O(n)
class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> mapv=new HashMap<>();
        HashMap<Character,Integer> mapc=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                if(mapv.containsKey(ch)){
                    mapv.put(ch,mapv.get(ch)+1);
                }
                else{
                    mapv.put(ch,1);
                }
            }
            else{
                if(mapc.containsKey(ch)){
                    mapc.put(ch,mapc.get(ch)+1);
                }
                else{
                    mapc.put(ch,1);
                }
            }
        }
        int maxv=0;
        int maxc=0;
        for(char i:mapv.keySet()){
            maxv=Math.max(maxv,mapv.get(i));
        }
        for(char i:mapc.keySet()){
            maxc=Math.max(maxc,mapc.get(i));
        }
        return maxc+maxv;
    }
    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int maxVowel = 0, maxConso = 0;
        for (char c : s.toCharArray()) {
            int i = c - 'a';
            freq[i]++;
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                maxVowel = Math.max(maxVowel, freq[i]);
            else
                maxConso = Math.max(maxConso, freq[i]);
        }
        return maxVowel + maxConso;
    }
}
