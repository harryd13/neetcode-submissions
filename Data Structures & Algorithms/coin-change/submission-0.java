class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int inf = amount+1;
        int [][] t = new int[n+1][amount+1];

        //initialize table
        for(int i=0;i<=amount;i++){
            t[0][i] = inf;
        }

        for(int i = 1;i<n+1;i++){
            for(int j = 1; j<amount+1;j++){
                if(coins[i-1]<=j){
                    t[i][j] = Math.min(
                        1+t[i][j-coins[i-1]],
                        t[i-1][j]
                    );
                }else{
                     t[i][j] = t[i-1][j];
                }
            }
        }

        if(t[n][amount] == inf) return -1;
        else return t[n][amount];
    }
}
