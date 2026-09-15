class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create a map to check
        Map<Integer,Integer> mp = new HashMap<>();
        //fill the map

        for(int i=0; i<nums.length; i++){
            int needed = target - nums[i];
            if(mp.containsKey(needed)){
                return new int[]{mp.get(needed),i};
            }
            mp.put(nums[i],i);
        }
        
        return new int[]{};
        
    }
}
