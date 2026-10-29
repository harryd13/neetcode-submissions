class Solution {
    public int leastInterval(char[] tasks, int n) {

        // Step 1: Count task frequencies
        int[] freq = new int[26];

        for (char task : tasks) {
            freq[task - 'A']++;
        }

        // Step 2: Find the maximum frequency
        int maxFreq = 0;

        for (int count : freq) {
            maxFreq = Math.max(maxFreq, count);
        }

        // Step 3: Count tasks tied for max frequency
        int maxCount = 0;

        for (int count : freq) {
            if (count == maxFreq) {
                maxCount++;
            }
        }

        // Step 4: Calculate the minimum cycles
        int minCycles =
            (maxFreq - 1) * (n + 1) + maxCount;

        return Math.max(tasks.length, minCycles);
    }
}
