// Brute Force TC: O(N) SC: O(N)
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        smallest(root);
        return ans.get(k-1);
    }
    List<Integer> ans=new ArrayList<>();
    public void smallest(TreeNode root){
        if(root==null)
        return;
        
        smallest(root.left);
        ans.add(root.val);
        smallest(root.right);
        
    }
}
// Optimised approach TC: O(N) SC: O(1)
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        
         smallest(root,k);
         return ans;
    }
    int ans=-1;
    int c=0;
    public void smallest(TreeNode root,int k){
        if(root==null)
        return;
        
        smallest(root.left,k);
        c++;
        if(c==k){
            ans=root.val;
            return;
        }
        smallest(root.right,k);
    }
}
