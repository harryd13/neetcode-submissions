class Solution {
    public int longestConsecutive(int[] nums) {
        // create and fill hashset
        Set<Integer> uniq = new HashSet<>();
        for(int n: nums){
            uniq.add(n);
        } 

        //-----traverse set
        int longest = 0;
        for(int num : uniq){
            if(uniq.contains(num-1)) continue;
            // this means itis a starting point
            int current = num;
            int count = 1;
            
            while(uniq.contains(current + 1)){
                current ++;
                count++;
            }
            if(count>longest) longest = count;
        }
        return longest;
    }
}
