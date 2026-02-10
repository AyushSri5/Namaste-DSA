// Optimised approach TC: O(n*m) SC: O(n*m)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];

            int[] freq = new int[26];
            for (int j = 0; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
            }

            // Build pattern using StringBuilder with separator
            StringBuilder pattern = new StringBuilder();
            for (int j = 0; j < 26; j++) {
                pattern.append(freq[j]).append('#');
            }

            String key = pattern.toString();

            // Insert into map
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        // Build final answer
        return new ArrayList<>(map.values());
    }
}
