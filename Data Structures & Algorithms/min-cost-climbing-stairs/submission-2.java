class Solution {
    int[] t = new int[101];
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return minCost(cost, n);
    }
    public int minCost(int[] cost, int i){
        if(i == 0 || i == 1) return t[i]=0;
        if(t[i]!= 0) return t[i];
        else{
            return t[i]=Math.min(minCost(cost, i-1)+cost[i-1],minCost(cost, i-2)+cost[i-2]);
        }
        
    }
}
