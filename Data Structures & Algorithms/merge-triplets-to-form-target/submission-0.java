class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {

        int[] result = new int[3];

        for (int[] t : triplets) {

            // Discard invalid triplets
            if (t[0] > target[0] ||
                t[1] > target[1] ||
                t[2] > target[2])
                continue;

            // Merge valid triplets
            result[0] = Math.max(result[0], t[0]);
            result[1] = Math.max(result[1], t[1]);
            result[2] = Math.max(result[2], t[2]);
        }

        return Arrays.equals(result, target);
    }
}