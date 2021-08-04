public class NPower {


    // Time - O(logn) -- Space - O(n)
    public double myPow(double x, int n) {

        long p = n;
        double ans = 1.0;

        if(n < 0){
            p = p * -1;
        }

        while(p > 0){
            if(p % 2 == 1){
                ans = ans * x;
                p = p - 1;
            }else{
                x = x * x;
                p = p / 2;
            }
        }

        return (n < 0) ? (1.0 / ans) : (ans);
    }

}
