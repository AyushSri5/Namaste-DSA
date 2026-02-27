// Optimised approach TC: O(n) SC: O(n) Stack Space
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return path(root,targetSum);
    }
    public boolean path(TreeNode root,int target){
        if(root==null)
        return false;
        if(root.left==null && root.right==null){
            return (target-root.val)==0;
        }
        boolean left=path(root.left,target-root.val);
        boolean right=path(root.right,target-root.val);
        return left || right;
    }
}
