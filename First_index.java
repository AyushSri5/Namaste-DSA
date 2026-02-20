// Optimised approach Two Pointer TC: O(n) SC: O(1)
class Solution {
    public int strStr(String hs, String nd) {
        if (nd.length() == 0) return 0;

        for (int i = 0; i <= hs.length() - nd.length(); i++) {
            int j = 0;
            while (j < nd.length() && hs.charAt(i + j) == nd.charAt(j)) {
                j++;
            }
            if (j == nd.length()) {
                return i;
            }
        }
        return -1;
    }
}
