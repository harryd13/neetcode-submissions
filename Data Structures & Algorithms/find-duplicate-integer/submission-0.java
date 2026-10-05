class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int n : nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
            if(mp.get(n)>1){
                return n;
            }
        }
        return 0;

    }
}
