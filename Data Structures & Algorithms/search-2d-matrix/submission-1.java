class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // flatten this array mentally.
        int m = matrix.length; int n = matrix[0].length;
        int l = m*n;
        int left = 0;int right = l-1;
        while(left<= right){
            int mid = (left+right)/2;
            int i = mid/n; int j = mid%n;
            if(target == matrix[i][j]) return true;
            else if(target > matrix[i][j]) left = mid+1;
            else right = mid-1;
        }
        return false;
    }
}
