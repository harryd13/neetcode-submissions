class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> dec = new Stack<>();
        int[] result = new int[temp.length];

        for(int i=0; i<temp.length; i++){
            int curr = temp[i];
            while(!dec.isEmpty() && curr > temp[dec.peek()]){
                result[dec.peek()] = i-dec.peek();
                dec.pop();
            }   
            dec.push(i);
        }
        return result;
    }   
}
