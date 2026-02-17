// Optimised approach TC: O(n) SC: O(n)
class Solution {
    public int firstUniqueFreq(int[] nums) {
       HashMap<Integer,Integer> freq=new HashMap<>();
      HashMap<Integer,Integer> map=new HashMap<>();
       for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
       }
       for(int i:map.keySet()){
        freq.put(map.get(i),freq.getOrDefault(map.get(i),0)+1);
       }
      for(int i:nums){
        if(freq.get(map.get(i))==1)
        return i;
      }
      return -1;
    }
}
