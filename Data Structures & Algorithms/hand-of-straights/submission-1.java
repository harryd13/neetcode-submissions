class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;

        int[] freq = new int[1001];

        for (int card : hand) {
            freq[card]++;
        }

        for (int i = 0; i < freq.length; i++) {

            while (freq[i] > 0) {

                // Form a consecutive group starting from i
                for (int j = i; j < i + groupSize; j++) {
                    if (j >= freq.length || freq[j] == 0)
                        return false;

                    freq[j]--;
                }
            }
        }

        return true;
    }
}