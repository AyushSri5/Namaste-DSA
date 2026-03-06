// Optimised approach TC: O(n) SC: O(n)
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        right(root,0);
        return ans;
    }
    List<Integer> ans=new ArrayList<>();
    public void right(TreeNode root,int level){
        if(root==null)
        return;

        if(ans.size()==level)
        ans.add(root.val);
        
        right(root.right,level+1);
        right(root.left,level+1);
    }
}
