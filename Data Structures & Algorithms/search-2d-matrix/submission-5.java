class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int top = 0;
        int bot = ROWS - 1;

        while(top <= bot){
            int row = (top+bot) /2;
            if(target > matrix[ROWS][COLS - 1]){
                row = top + 1;
            }
        else if(target < matrix[ROWS][0]){
                row = bot - 1;
         }
         else{
            return false;
         }
        }

        int l = 0
        int r = COLS - 1;
        int row = (l+r)/2;
        while(l <=r ){
            int m = (l+r)/2;
            if(target < matrix[row][m]){
                m = l + 1;
            }
            else if(target > matrix[row][m]){
                m = r - 1;
            }
            else {
                return true;
            }
            
        }
        return false;
    }
}
