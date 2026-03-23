// Optimised approach TC: O(N) SC: O(N) Stack Space
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        comb(1,n,k,new ArrayList<>());
        return ans;
    }
    List<List<Integer>> ans = new ArrayList<>();
    public void comb(int i,int n,int k,List<Integer> temp){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(i>n){
            
            return;
        }
        
        temp.add(i);
        comb(i+1,n,k,temp);
        temp.remove(temp.size()-1);
        comb(i+1,n,k,temp);
    }
}
