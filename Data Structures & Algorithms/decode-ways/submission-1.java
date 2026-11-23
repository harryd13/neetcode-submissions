class Solution {
    int[] t = new int[101];
    public int numDecodings(String s) {
        return solve(s, 0);
    }
    public int solve(String s, int i ){ // gives nunmber of decodings possible, starting from i
        if(i == s.length()) return t[i]= 1;
        if(s.charAt(i) == '0') return t[i]= 0;
        if(t[i] != 0) return t[i];
        int takeOne = solve(s,i+1);
        int takeTwo = 0;
        if(i+1 < s.length() &&
            (s.charAt(i) == '1' ||
            (s.charAt(i) == '2'&& s.charAt(i+1) <= '6')))
            takeTwo = solve(s, i + 2);

        return t[i]=takeOne+takeTwo;
    }

}
