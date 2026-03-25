// Optimised approach TC: O(2^T * K) SC: O(K*X)
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        comb(0,candidates,target,new ArrayList<>());
        return ans;
    }
    List<List<Integer>> ans=new ArrayList<>();
    public void comb(int i,int c[],int tar,List<Integer> temp){
       
        if(tar==0){
            // temp.add(c[i]);
            ans.add(new ArrayList<>(temp));
            return;
        }
         if(tar<0 || i==c.length)
        return;
        temp.add(c[i]);
        comb(i,c,tar-c[i],temp);
        temp.remove(temp.size()-1);
        comb(i+1,c,tar,temp);
    }
}
