class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //1,3 |     1 | 3
        //|2,4       2 | 4   
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;
        if(n1>n2) return findMedianSortedArrays(nums2,nums1);
        int low = 0;
        int high = n1; //we can take 2 elements 
        
        //we need to decide how many elements to take from smaller(first) array.
        while(low <= high){
            int mid1 = (high+low)/2;
            int mid2 = ((n+1)/2)-mid1;
            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;
            if(mid1>0) l1 = nums1[mid1-1]; // l1 will only be present if we take at least 1 element
            if(mid1<n1) r1 = nums1[mid1]; // r1 will present only until we take all elements
            if(mid2>0) l2 = nums2[mid2-1];
            if(mid2<n2) r2 = nums2[mid2];

            //answer case :
            if(l1 <= r2 && l2 <= r1){
                if(n%2 == 0){
                    return (double)(Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }else{
                    return (double)Math.max(l1,l2);
                }
            }
            if(l1 > r2)//means we took too many elements move mid to left
            {
                high = mid1-1;
            }
            if(l2 > r1){
                low = mid1+1;
            }
        }
        return 0;
    }
}
