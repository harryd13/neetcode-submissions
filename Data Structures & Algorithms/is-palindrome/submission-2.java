class Solution {
    public boolean isPalindrome(String s) {
       
        int i = 0;
        int j = s.length() -1 ;

        while(i < j){
            while(i<j && !isValid(s.charAt(i))){
                i++;
            }
            while(i<j && !isValid(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))return false;
            i ++;
            j --;
        }
        return true;
    }
    private boolean isValid(char c){
        return Character.isLetterOrDigit(c);
    }
}
