class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for (String s : strs){
            //make its encoding for key use
            int [] signature = new int[26];//array 
            for (char c : s.toCharArray()){
                signature[c - 'a']++;
            }

            //make this signature into string key as 0#1#0#....11#
            StringBuilder sigki = new StringBuilder();
            for (int i : signature){
                sigki.append('#').append(i);
            }

            String skey = sigki.toString();
            if (mp.get(skey) == null) {
                mp.put(skey, new ArrayList<>());
            }
            mp.get(skey).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
