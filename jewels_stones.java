// Brute Force TC: O(n) SC: O(n)
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            hs.add(jewels.charAt(i));
        }
        int count=0;
        for(int i=0;i<stones.length();i++){
            if(hs.contains(stones.charAt(i)))
            count++;
        }
        return count;
    }
}
// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] cnt = new int[128];
        for (char c : S.toCharArray())
            cnt[c]++;
        int ans = 0;
        for (char c : J.toCharArray())
            ans += cnt[c];
        return ans;
    }
}
