class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //transform to a map
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        //create min heap:
        PriorityQueue<Integer> minHeap =
            new PriorityQueue<>(
                (a, b) -> mp.get(a) - mp.get(b)
            );

        // loop on the map:
        for(int num: mp.keySet() ){
            minHeap.offer(num);
            //keep k elements
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }
}
