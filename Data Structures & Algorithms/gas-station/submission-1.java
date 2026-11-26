class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int n = gas.length;
        for(int i= 0;i<n;i++){
            sum += gas[i] - cost[i];
        }
        if(sum < 0) return -1;

        int tank = 0;
        int start = 0;
        for(int i =0; i<n ;i++){
            tank += gas[i] - cost[i]; // current tank value
            if(tank < 0){ //if it is negative cant go to next so update start point
                start = i+1;
                tank = 0;
            }
        }

        return start;
    } 
}
