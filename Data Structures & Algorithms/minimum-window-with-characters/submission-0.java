class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[60];
        //fill the hashmap
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'A']++;
        }
        //two pointers
        int l =0;int r = 0;
        int count = 0;
        int minLen = s.length()+100;
        int sindex = -1;
        while(r<s.length()){
            if(freq[s.charAt(r)-'A']>0){
                count ++;
            }
            freq[s.charAt(r)-'A']--;
            while(count == t.length()){
                //find the length as this is one possible solution
                int len = r-l+1;
                if(len < minLen){
                    minLen = len;
                    sindex = l;
                }

                freq[s.charAt(l)-'A']++;
                if(freq[s.charAt(l)-'A']>0) count--;
                l++;

            }
            r++;
        }
        return sindex==-1?"":s.substring(sindex,sindex + minLen);
    }
}
