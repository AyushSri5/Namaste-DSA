// Optimised approach TC: O(N) SC: O(N)
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Queue<TreeNode> curr=new LinkedList<>();
        Queue<TreeNode> next=new LinkedList<>();
        boolean flag=false;
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
                if(flag){
                    Collections.reverse(temp);
                }
                flag=!flag;
                ans.add(new ArrayList<>(temp));
                temp=new ArrayList<>();
            }
        }
        return ans;
    }
}
