public class Search2DMatrix {

    //Time - O(n + m) --- Space - O(1)

//    public boolean searchMatrix(int[][] matrix, int target) {
//
//        if (matrix.length == 0) return false;
//
//        int n = matrix.length;
//        int m = matrix[0].length;
//
//        int i = 0, j = m - 1;
//        while (i < n && j >= 0) {
//
//            if (matrix[i][j] == target) {
//                return true;
//            }
//            if (matrix[i][j] > target) {
//                j--;
//            } else {
//                i++;
//            }
//        }
//
//        return false;
//    }


    //Time - O(log(n+m)) --- Space - O(1)

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length == 0) return false;

        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0;
        int j = (n * m) - 1;

        while(i <= j){
            int mid = (i + j) /2;

            if(matrix[mid / m][mid % m] == target){
                return true;
            }else if(matrix[mid / m][mid % m] > target){
                j = mid-1;
            }else{
                i = mid+1;
            }

        }

        return false;

    }

}
