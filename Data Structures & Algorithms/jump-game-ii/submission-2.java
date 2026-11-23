class Solution {
    public int jump(int[] nums) {
        //the times mi changes is min count -
        int maxIndex = 0;
        int currentEnd = 0;
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            maxIndex = Math.max(maxIndex, i + nums[i]);
            if(i==currentEnd) //we have exhausted max of first step
            {
                count++;
                currentEnd=maxIndex; //next step can take us till maxIndex
            }
        }

        return count;
    }
}
