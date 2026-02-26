// Optimised approach TC: O(n) SC: O(n)
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Queue<TreeNode> curr=new LinkedList<>();
        Queue<TreeNode> next=new LinkedList<>();
        if(root==null)
        return ans;
        curr.add(root);
        while(!curr.isEmpty()){
            TreeNode c=curr.poll();
            temp.add(c.val);
            if(c.left!=null){
                next.add(c.left);
            }
            if(c.right!=null){
                next.add(c.right);
            }
            if(curr.isEmpty()){
                curr=next;
                next=new LinkedList<>();
                ans.add(new ArrayList<>(temp));
                temp=new ArrayList<>();
            }
        }
        return ans;
    }
}
