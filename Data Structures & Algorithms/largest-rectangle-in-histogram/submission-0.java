class Solution {
    public int largestRectangleArea(int[] h) {
        // append a -1 in front and back hypothetically.
        // get pse on the fly, , we will calculate the area once popped.
        // we need to keep track of max area.
        // we need to calculate area till end of stack.

        int n = h.length;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        int ans = -1;

        for(int i=0; i<n; i++){
            while(stack.peek() != -1 && h[stack.peek()]>h[i]){
                int height = h[stack.pop()];
                int pse = stack.peek();
                int nse = i;
                int area = height*(nse-pse-1);
                ans = Math.max(area,ans);
            }
            stack.push(i);
        }
        //stack has filled now next smallest element is at n
        while(stack.peek()>-1){
            int height = h[stack.pop()];
            int pse = stack.peek();
            int nse = n;
            int area = height*(nse-pse-1);
            ans = Math.max(area,ans);
        }

        return ans;
    }
}
