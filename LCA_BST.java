// Optimised approach TC: O(N) SC: O(N)
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lowest(root,p,q);
    }
    public TreeNode lowest(TreeNode root,TreeNode p,TreeNode q){
        if(root==null)
        return null;

        if(root.val>p.val && root.val>q.val){
            return lowest(root.left,p,q);
        }
        else if(root.val<p.val && root.val<q.val){
            return lowest(root.right,p,q);
        }
        else{
            return root;
        }
    }
}
