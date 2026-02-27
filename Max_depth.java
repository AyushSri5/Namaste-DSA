// Optimised approach TC: O(n) SC: O(n) Stack Space
class Solution {
    public int maxDepth(TreeNode root) {
        depth(root,1);
        return ans;
    }
    int ans=0;
    public void depth(TreeNode root,int c){
        if(root==null)
        return;

        ans=Math.max(ans,c);
        depth(root.left,c+1);
        depth(root.right,c+1);
    }
}
