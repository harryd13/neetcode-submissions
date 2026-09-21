class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();int n2 = s2.length();
        if(n1>n2)return false;
        int[] f1 = new int[26];
        //create mapping for s1
        for(int i= 0;i<n1;i++){
            f1[s1.charAt(i)-'a']++;
        }
        int l = 0;int r = n1-1;
        while(r<n2){
            if(Arrays.equals(freqOfWindow(s2, l, r), f1)) return true;
            l++;
            r++;
        }
        return false;
    }
    public int[] freqOfWindow(String s, int i, int j){
        int[] f = new int[26];
        for(int k = i;k<j+1;k++){
            f[s.charAt(k)-'a']++;
        }
        return f;
    }

}
