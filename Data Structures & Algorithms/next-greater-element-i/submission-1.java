class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {//1,3,4,2
        int n = nums2.length;// 4
        Deque<Integer> s = new ArrayDeque<>();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=n-1; i>-1; i--){
            while(!s.isEmpty() && s.peek()<=nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                map.put(nums2[i],-1);
                s.push(nums2[i]);
                continue;
            }
            map.put(nums2[i],s.peek());
            s.push(nums2[i]);
        }// nge = 3,4,-1,-1

        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}