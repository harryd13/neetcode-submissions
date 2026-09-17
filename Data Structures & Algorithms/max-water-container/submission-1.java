class Solution {
    public int maxArea(int[] heights) {
        int ans = 0;
        int n = heights.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            //area base * height (base is getting smaller by 1)
            int area =Math.min(heights[i],heights[j]) * (j-i);
            if(area > ans) ans = area;
            if(heights[i]<heights[j]){
                int oldHeight = heights[i];
                do{
                    i++;
                }while(i<j &&  (oldHeight > heights[i]));
            }else{
                int oldHeight = heights[j];
                do{
                    j--;
                }while(i<j && (oldHeight>heights[j]));
                
            }
        }
        return ans;
        

    }
}
