class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // we need to search hours from 1 to max in piles
        int left = 1;
        int right = 0;
        for(int p: piles){
            if(p>right) right = p;
        }
        
        while(left <= right){
            int mid = (left+right)/2;
            if(totalHrs(piles, mid) <= h ){

                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;

    }
    public int totalHrs(int[] piles, int h){
        int ans = 0;
        for(int p : piles){
            ans += Math.ceil((double)p/(double)h);
        }
        return ans;
    }
}
