// Optimised approach TC: O(n) SC: O(n) Stack Space
class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root,Integer.MIN_VALUE);
    }
    public int dfs(TreeNode node,int max){
        if(node==null)
        return 0;

        int good=(node.val>=max) ? 1: 0;
        max=Math.max(node.val,max);
        return good+dfs(node.left,max)+dfs(node.right,max);
    }
}
