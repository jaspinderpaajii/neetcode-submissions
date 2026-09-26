class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int max=0;
        int j=heights.length-1;
        while(i<j){
            int vol=Math.min(heights[i],heights[j])*(j-i);
            max=Math.max(vol,max);
            if(heights[j]<heights[i]){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
    }
}
