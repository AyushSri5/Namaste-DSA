// Brute Force TC: O(n) SC: O(n)
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // s -> t mapping check
            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2)
                    return false;
            } else {
                mapST.put(c1, c2);
            }

            // t -> s mapping check (prevents many-to-one)
            if (mapTS.containsKey(c2)) {
                if (mapTS.get(c2) != c1)
                    return false;
            } else {
                mapTS.put(c2, c1);
            }
        }

        return true;
    }
}
// Optimised approach TC: O(n) SC: O(1)
public boolean isIsomorphic(String s, String t) {
    int[] m1 = new int[256];
    int[] m2 = new int[256];

    for(int i=0;i<s.length();i++){
        if(m1[s.charAt(i)] != m2[t.charAt(i)])
            return false;

        m1[s.charAt(i)] = i+1;
        m2[t.charAt(i)] = i+1;
    }
    return true;
}
