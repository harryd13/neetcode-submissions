class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //transform to a map order of n
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        //we create a freq chart:
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        // Fill from mp:
        for(int num: mp.keySet() ){
            int freq = mp.get(num);
             if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }
        int[] result = new int[k];
        int count = 0;
        for (int i=bucket.length-1  ; i>=0; i--) {
            if(bucket[i] != null){
                for(int n: bucket[i]){
                    if(count < k){
                        result[count] = n;
                        count ++;
                    }else break;

                }
            }
            
        }
        return result;
    }
}
