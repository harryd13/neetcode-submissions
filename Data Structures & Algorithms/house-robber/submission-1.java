class Solution {
    int[] t = new int[101];
    public int rob(int[] nums) {
        int n = nums.length;
        return solve(nums,n );
    }
    public int solve(int[] nums,int i){
        if(i <= 0) return 0;
        if(i == 1)return t[0] = nums[0];
        if(t[i]!=0)return t[i];
        else{
            return t[i] = Math.max(nums[i-1]+solve(nums, i-2), solve(nums, i-1));
        }
    }
}
