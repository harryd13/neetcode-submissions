class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int expectedSum = n * (n + 1) / 2;
        // int actualSum = 0;

        // for(int num : nums){
        //     actualSum += num;
        // }

        // return expectedSum - actualSum;

        int n = nums.length;
        int ans = 0;

        // XOR all expected numbers
        for(int i = 0; i <= n; i++){
            ans = ans ^ i;
        }

        // XOR all actual numbers
        for(int num : nums){
            ans = ans ^ num;
        }

        return ans;
    
    }
}
