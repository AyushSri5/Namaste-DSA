// Brute Force TC: O(N*2) SC: O(N)
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
         if(root==null)
        return 0;


        int left=diameterOfBinaryTree(root.left);
        int right=diameterOfBinaryTree(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(left,Math.max(right,lh+rh)); 
    }
    public int height(TreeNode root){
        if(root==null)
        return 0;
        int left=height(root.left);
        int right=height(root.right);
        return 1+Math.max(left,right);
    }
}
// Optimised approach TC: O(N) SC: O(N)
class Solution {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    public int height(TreeNode root) {
        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }
}
