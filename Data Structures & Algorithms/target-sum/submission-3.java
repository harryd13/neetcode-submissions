class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        int t = (sum+target)/2;
        if (Math.abs((long) target) > sum ||(sum + target) % 2 != 0) {
            return 0;
        }

        return countSubset(nums, t);
    }
    public int countSubset(int[] nums, int sum){
        int n = nums.length;
        int t[][] = new int[n+1][sum+1];
        t[0][0] = 1;
        for(int i=1; i<=n ;i++){
            for(int j=0; j<=sum; j++){
                if(nums[i-1] <= j){
                    t[i][j] = t[i-1][j-nums[i-1]]+t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][sum];
    }
}
