class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        //sort
        Arrays.sort(cars, (a,b)->Integer.compare(b[0],a[0]));

        //calc time
        Stack<Double> s = new Stack<>();

        for(int i= 0; i<n;i++){
            double currtime = (double)(target-cars[i][0])/cars[i][1];
            if(!s.isEmpty() && currtime > s.peek()){
                s.push(currtime);
            }
            if(s.isEmpty())s.push(currtime);
        }

        return s.size();
    }
}
