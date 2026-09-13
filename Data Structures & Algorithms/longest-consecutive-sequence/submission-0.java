class Solution {
    public int longestConsecutive(int[] nums) {
        // create a hashset
        Set<Integer> mySet = new HashSet<>();
        for (int num : nums){
            mySet.add(num);
        }

        //set answer
        int longest = 0;
        for(int n : nums){
            if (mySet.contains(n-1)){
                continue;
            }
            // find the longest sequence
            int current = n;
            int count = 1;
            while(mySet.contains(current+1)){
                count ++;
                current ++;
            }
            if(count > longest) longest = count;
        }
        return longest;

    }
}
