class Solution {
    public int lastStoneWeight(int[] stones) {
        //max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //fill:
        for(int s: stones){
            pq.offer(s);
        }

        //run the while loop
        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();
            if(x==y)continue;
            else{
                pq.offer(x-y);
            }
        }


        if(pq.size() == 0) return 0;
        return pq.peek();

    }
}
