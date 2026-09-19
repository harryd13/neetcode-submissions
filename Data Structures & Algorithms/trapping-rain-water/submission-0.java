class Solution {
    public int trap(int[] h) {
        //two pointers to store lmax, rmax
        int lmax = 0;
        int rmax = 0;
        int ans=0;
        int i = 0;
        int j = h.length-1;
        while(i<j){
            if(h[j]>h[i]){
                if(lmax > h[i]) {
                    ans = ans + (lmax-h[i]);
                }
                else{
                    lmax = h[i];
                }
                i++;
            }else{
                if(rmax > h[j]) ans = ans + (rmax-h[j]);
                else{
                    rmax = h[j];
                }
                j--;
            }
        }
        return ans;
    }
}
