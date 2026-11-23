class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        if(n==0)return 0;
        if(n==1) return 1;
        int start = 0;
        int sum = 0;
        for(int  i=0;i<n;i++){
            int len1 = expand(s,i,i);
            int len2 = expand(s,i,i+1);
            sum+= len1+len2;
        }

        return sum;
        
    }
    public int expand(String s, int left, int right){ // a, b, b, a
        int count = 0;
        while(left >=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}
