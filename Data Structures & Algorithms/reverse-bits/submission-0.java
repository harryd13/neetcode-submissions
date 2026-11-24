class Solution {
    public int reverseBits(int n) {
        int ans = 0;

        for(int i = 0; i < 32; i++){  // so we dont forget about starting o's
            int bit = n & 1; // get right bit
            ans = (ans << 1) | bit;  // make space and insert
            n = n >>> 1;  // shift
        }

        return ans;
    }
}
