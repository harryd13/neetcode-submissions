class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        int ansIndex = 0;

        for(int i = 0; i < n; i++){

            // 1. Remove elements outside current window
            if(!dq.isEmpty() && dq.peekFirst() < i - k + 1){
                dq.pollFirst();
            }

            // 2. Remove elements smaller than current element
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            // 3. Add current index
            dq.offerLast(i);

            // 4. Once first full window is formed
            if(i >= k - 1){
                ans[ansIndex++] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}