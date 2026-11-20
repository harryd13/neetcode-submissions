class Solution {
    int[] t = new int[101];
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int case1 = solve(nums, n-2);
        int[] nums2 = new int[n-1];
        for(int i=1;i<n;i++)
        {
            nums2[i-1] = nums[i];
        }
        // Reset memoization
        t = new int[101];
        int case2 = solve(nums2, n-2);
        return Math.max(case1, case2);
    }
    public int solve(int[] nums, int i){
        
        if(i==0) return nums[0];
        if(i<0) return 0;
        if(t[i]!= 0) return t[i];
        int take = nums[i]+ solve(nums,i-2);
        int leave = solve(nums,i-1);
        return t[i] = Math.max(take, leave);
    }
}
