public class SetMatrixZeros {

//    Time - O(nm) + O(nm) --- Space - O(n) + O(m)
//
//    public void setZeroes(int[][] matrix) {
//
//        int n = matrix.length;
//        int m = matrix[0].length;
//
//        int[] row = new int[n];
//
//        int[] col = new int[m];
//
//        for(int i = 0 ; i< n ; i++){
//            for(int j = 0; j < m ; j++){
//
//                if(matrix[i][j] == 0){
//
//                    row[i] = -1;
//                    col[j] = -1;
//
//                }
//
//            }
//        }
//
//        for(int i = 0 ; i< n ; i++){
//            for(int j = 0; j < m ; j++){
//
//                if(row[i] == -1 || col[j] == -1){
//
//                    matrix[i][j] = 0;
//
//                }
//
//            }
//        }
//
//    }

//    Time - O(nm) + O(nm) ---- Space - O(1)

    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;


        int col = 1;

        for(int i = 0 ; i< n ; i++){

            if(matrix[i][0] == 0){
                col = 0;
            }

            for(int j = 1; j < m ; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for(int i = n-1 ; i>=0 ; i--){
            for(int j = m-1; j>=1 ; j--){

                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
            if(col == 0){
                matrix[i][0] = 0;
            }
        }

    }
}
