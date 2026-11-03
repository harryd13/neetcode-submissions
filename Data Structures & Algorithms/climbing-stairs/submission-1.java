class Solution {
    int[] t = new int[46];
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(t[n] != 0) return t[n];
        return t[n] = (climbStairs(n-1) + climbStairs(n-2));
    }
}
