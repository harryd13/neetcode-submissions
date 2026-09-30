class Solution {
    public int binSearch(int[] n, int t, int i, int j){
        int mid = (i+j)/2;
        if(i == j){
            if(t == n[i])return i ;
            else return -1;
            
        }
        if(t>n[mid]){
            return binSearch(n,t,mid+1,j);
        }else{
            return binSearch(n,t,i,mid);
        }

    }
    public int search(int[] nums, int target) {
        return binSearch(nums,target,0,nums.length-1);
    }
}
