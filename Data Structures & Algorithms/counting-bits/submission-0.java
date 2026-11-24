class Solution {
    public int[] countBits(int n) {
        int[] t = new int [n+1];
        for(int i = 1;i<n+1;i++){
            int remaining = i & (i - 1);
            t[i] = 1 + t[remaining];
        }
        return t;
    }
}
