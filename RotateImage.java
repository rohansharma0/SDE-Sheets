public class RotateImage {


    //Time - O(n^2) + O(n^2) --- Space - O(1)

    public void rotate(int[][] matrix) {

        transpose(matrix);
        reverse(matrix);

    }

    public static void transpose(int[][] mat){

        for(int i = 0 ; i<mat.length ; i++){
            for(int j = i; j < mat[0].length ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void reverse(int[][] mat){

        for(int i = 0 ; i< mat.length ; i++){

            int li = 0 ;
            int hi = mat[0].length -1;

            while(li < hi){
                int temp = mat[i][li];
                mat[i][li] = mat[i][hi];
                mat[i][hi] = temp;
                li++;
                hi--;
            }
        }

    }
}
