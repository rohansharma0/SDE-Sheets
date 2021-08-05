public class GridUniquePaths {

    public static void main(String[] args) {

        int[][] dp = new int[3][7];

//        int paths =  gridPaths(0 , 0 , 3, 7 ,dp);
        int paths = gridPaths(3 , 7);
        System.out.println(paths);;


    }

    //Time - O(n) / o(m) -- Space - O(1)
    public static int gridPaths(int n , int m) {
        int N = n + m -2;
        int r = n-1;

        double res  = 1;

        for(int i = 1 ; i <= r ; i++){
           res = res * (N - r + i) / i;
        }

        return (int)res;
    }




    //Without DP this algorithm takes exponential time complexity
    //After using Dp -- Time - O(n * m) --- Space - O(n * m)


    public static int gridPaths(int i , int j , int m , int n , int[][] dp){


        if( i == m - 1 && j == n -1){
            return 1;
        }

        if(i >= m || j >= n){
            return 0;
        }

        if(dp[i][j] != 0){
            return dp[i][j];
        }
        int c= 0;
        c += gridPaths(i + 1 , j , m, n , dp);
        c += gridPaths(i , j+1 , m , n , dp) ;

        dp[i][j] = c;

        return c;

    }



}
