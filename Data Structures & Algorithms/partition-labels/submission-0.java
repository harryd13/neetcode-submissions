class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> ans = new ArrayList<>();
        // find last occurances - 
        int[] last = new int[26];
        for (int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        // we need to keep track of i, last index and end
        int start = 0;
        int end = 0;
        for(int i=0;i<n;i++){
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if(i == end){
                //add length to ans
                ans.add(end-start+1);
                start = i + 1;
            }
        }
        return ans;
    }

}
