class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();int n2 = s2.length();
        if(n1>n2)return false;
        int[] f1 = new int[26];
        int[] f2 = new int[26];

        //create mapping for s1
        for(int i= 0;i<n1;i++){
            f1[s1.charAt(i)-'a']++;
            f2[s2.charAt(i)-'a']++;
        }
        if (Arrays.equals(f1, f2)) {
            return true;
        }
        for (int r = n1; r < n2; r++) {

            // incoming character
            f2[s2.charAt(r) - 'a']++;

            // outgoing character
            int l = r - n1;
            f2[s2.charAt(l) - 'a']--;

            if (Arrays.equals(f1, f2)) {
                return true;
            }
        }

        return false;
    }
   

}
