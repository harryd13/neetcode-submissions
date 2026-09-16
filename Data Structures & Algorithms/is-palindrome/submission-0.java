class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sf = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sf.append(Character.toLowerCase(c));
            }
        }
        int i = 0;
        int j = sf.length() -1 ;

        while(i < j){
            if(sf.charAt(i) != sf.charAt(j))return false;
            i ++;
            j --;
        }
        return true;
    }
}
