// Optimised approach TC: O(Nlog(N)) SC: O(N)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
            pq.add(i);
        }
        while(k-->1){
            pq.remove();
        }
        return pq.remove();
    }
}
