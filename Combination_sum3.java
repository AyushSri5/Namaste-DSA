// Optimised approach TC: O(1) SC: O(X*K)
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        comb(1, n, k, new ArrayList<>());
        return ans;
    }

    List<List<Integer>> ans = new ArrayList<>();

    public void comb(int i, int n, int k, List<Integer> temp) {
         if (k == 0 && n == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (k < 0 || n < 0 || i > 9) return;

       

        // include
        temp.add(i);
        comb(i + 1, n - i, k - 1, temp);
        temp.remove(temp.size() - 1);

        // exclude
        comb(i + 1, n, k, temp);
    }
}
