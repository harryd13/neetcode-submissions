class Solution {
    public boolean isAnagram(String s, String t) {
        return  mapper(s).equals(mapper(t));
    }
    private String mapper(String s){
        Map<Character, Integer> freq = new HashMap<>();
        for (char c :s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1 );
        }
        //convert this to key
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append("#");
            sb.append(freq.getOrDefault(c, 0));
        }
        String result = sb.toString();
        return result;
    }
}
