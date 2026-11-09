class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=-1;
        int low=0;
        int high=matrix.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][matrix[0].length-1]){
                r=mid;
                break;
            }
            else if(target<matrix[mid][0]){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        if (r==-1){
            return false;
        }
        int lowc=0;
        int highc=matrix[0].length-1;
        while(lowc<=highc){
            int midc=lowc+(highc-lowc)/2;
            if(matrix[r][midc]==target){
                return true;
            }
            else if(matrix[r][midc]<target){
                lowc=midc+1;
            }
            else{
                highc=midc-1;
            }
        }
        return false;
    }
}
