// Optimised approach TC: O(2^N * K) SC: O(X*K)
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
        for(int j=i;j<c.length;j++){
            if(j>i && c[j]==c[j-1])
            continue;
        temp.add(c[j]);
        comb(j+1,c,tar-c[j],temp);
        temp.remove(temp.size()-1);
        }
    }
}
