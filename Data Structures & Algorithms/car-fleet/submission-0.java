class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        //create a time array
        int n = position.length;
        int[][] cars = new int[n][2];
        for(int i=0;i<n;i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) ->
            Integer.compare(b[0], a[0])
        );
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int currentPosition = cars[i][0];
            int currentSpeed = cars[i][1];
            double currentTime =
                (double) (target - currentPosition) / currentSpeed;

            if (stack.isEmpty() || currentTime > stack.peek()) {
                stack.push(currentTime);
            }
        }

        return stack.size();
    }
}
