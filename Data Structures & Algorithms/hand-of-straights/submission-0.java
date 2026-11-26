class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0) return false;
        int groups = n / groupSize;

        Arrays.sort(hand);
        Map<Integer, Integer> map = new HashMap<>();
        for (int card : hand) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        int index = 0;
        for (int g = 0; g < groups; g++) {
            // Find the smallest unused card
            while (index < n && map.get(hand[index]) == 0) {
                index++;
            }
            int start = hand[index];
            // Consume groupSize consecutive cards
            for (int j = 0; j < groupSize; j++) {
                int card = start + j;

                if (map.getOrDefault(card, 0) == 0)
                    return false;

                map.put(card, map.get(card) - 1);
            }
        }
        return true;
    }
}
