
class Solution {
    int[] t;

    public boolean wordBreak(String s, List<String> wordDict) {
        t = new int[s.length()];
        Arrays.fill(t, -1);

        return solve(s, 0, wordDict);
    }

    public boolean solve(String s, int i, List<String> words) {
        // Base condition
        if (i == s.length()) return true;

        // Already calculated
        if (t[i] != -1) return t[i] == 1;

        for (String word : words) {
            if (s.startsWith(word, i)) {
                if (solve(s, i + word.length(), words)) {
                    t[i] = 1;
                    return true;
                }
            }
        }

        // All possibilities failed
        t[i] = 0;
        return false;
    }
}
