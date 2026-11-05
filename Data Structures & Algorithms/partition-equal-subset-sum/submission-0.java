class Solution {
    public boolean canPartition(int[] nums) {
        //calculate sum:
        int s = 0;
        for(int num : nums){
            s += num;
        }
        if(s%2 != 0) return false;
        return subsetSum(nums,s/2);
    }
    public boolean subsetSum(int[] nums,int w){
        int n = nums.length;
        // create t
        boolean[][] t = new boolean[n+1][w+1];
        //initialize - 
        for(int i=0; i<n+1;i++){
            for (int j = 0; j<w+1; j++){
                if(i == 0){
                    t[i][j] = false;
                }
                if(j == 0){
                    t[i][j] = true;
                }
            }
        }

        //fill up dp table:
        for(int i=1; i<n+1;i++){
            for (int j=1; j<w+1; j++){
               if(nums[i-1] <= j){
                t[i][j] = t[i-1][j-nums[i-1]] || t[i-1][j];
               }else{
                t[i][j] = t[i-1][j];
               }
            }
        }

        return t[n][w];
    
    }
}
