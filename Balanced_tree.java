// Brute Force TC: O(Nlog(N)) SC: O(N) 
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        return true;


        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.abs(lh-rh)<=1 && left && right; 
    }
    public int height(TreeNode root){
        if(root==null)
        return 0;
        int left=height(root.left);
        int right=height(root.right);
        return 1+Math.max(left,right);
    }
}
