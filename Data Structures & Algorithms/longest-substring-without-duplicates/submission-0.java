class Solution {
    public int lengthOfLongestSubstring(String s) {
        //we need a set
        Set<Character> seen = new HashSet<>();
        //two pointers
        int i = 0;
        int ans = 0;

        for(int j = 0;j<s.length();j++){
            //get current element
            char current = s.charAt(j);

            while(seen.contains(current)){
                seen.remove(s.charAt(i));
                i++;
            }

            seen.add(current);
            ans = Math.max(ans, j-i+1);
        }
        return ans;
    }
}
