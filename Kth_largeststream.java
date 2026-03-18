// Optimised approach TC: O(Nlog(K)) SC: O(K)
class KthLargest {
    PriorityQueue<Integer> pq;
    int size;
    public KthLargest(int k, int[] nums) {
        pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
        }
        System.out.println(pq);
        size=k;
        while(pq.size()>k){
            pq.remove();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>size)
        pq.remove();
        return pq.peek();
    }
}
