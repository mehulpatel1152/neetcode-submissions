class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;

        int i=0,j=row*col - 1;

        while(i<=j){
            int mid = (i+j)/2;
            int nrow = mid/col;
            int ncol = mid%col;

            if(matrix[nrow][ncol]<target)i=mid+1;
            else if(matrix[nrow][ncol]>target)j=mid-1;
            else return true;
        }


        return false;
    }
}
