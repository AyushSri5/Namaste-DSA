// Optimised approach TC: O(n) SC: O(n)
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return same(p,q);
    }
    public boolean same(TreeNode a,TreeNode b){
        if((a==null && b!=null)||(a!=null && b==null)){
            return false;
        }
        if(a==null && b==null){
            return true;
        }
        if(a.val != b.val){
            return false;
    }
        
        return same(a.left,b.left) && same(a.right,b.right);
    }
}
