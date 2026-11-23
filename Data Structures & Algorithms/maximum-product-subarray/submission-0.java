class Solution {
    public int maxProduct(int[] nums) {
        int pre = 1;
        int suf = 1;
        int n  = nums.length;
        int preMax = Integer.MIN_VALUE;
        int sufMax = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(pre==0) pre = 1;
            if(suf == 0) suf = 1;
            pre = pre * nums[i];
            suf = suf * nums[n-1-i];
            preMax = Math.max(pre, preMax);
            sufMax = Math.max(suf, sufMax);
        }
        return Math.max(preMax, sufMax);
    }
}
