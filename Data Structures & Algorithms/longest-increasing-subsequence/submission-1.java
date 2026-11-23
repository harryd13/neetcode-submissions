


class Solution {
    int[][] t;

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        t = new int[n][n + 1];

        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        return solve(nums, n - 1, -1);
    }

    public int solve(int[] nums, int i, int prev) {

        // Base condition
        if (i < 0) return 0;

        // Memoization check
        if (t[i][prev + 1] != -1) {
            return t[i][prev + 1];
        }

        // Not Take
        int notTake = solve(nums, i - 1, prev);

        // Take
        int take = 0;
        if (prev == -1 || nums[i] < nums[prev]) {
            take = 1 + solve(nums, i - 1, i);
        }

        return t[i][prev + 1] = Math.max(take, notTake);
    }
}
