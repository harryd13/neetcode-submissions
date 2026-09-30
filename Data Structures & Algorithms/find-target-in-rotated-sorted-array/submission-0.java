class Solution {
    public int search(int[] nums, int target) {
        int left = 0; int right = nums.length -1; 
        // 3 , 4, 5 , 6, 1 ,2
        while (left <= right)
        {
            int mid = (left+right)/2;
            if(nums[mid] == target) return mid;

            if(nums[left] <= nums[mid]){//left array is sorted
                if(nums[left] <= target && target< nums[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{ // _ _ _ mid 2,3,6
                if(nums[mid] < target && target<= nums[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
