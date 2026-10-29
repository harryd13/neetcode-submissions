class Solution {
    public int findKthLargest(int[] nums, int k) {
        // min heap
        PriorityQueue<Integer> pq = new PriorityQueue(); 
        //2 -> 2,3 -> 1|,2,3 -> 2|,3,5 -> 3|,4,5 ;
        for(int n: nums){
            pq.offer(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
