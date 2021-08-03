import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    //Time - O(n^2) --- space - O(n^2) for whole triangle
    //Time - O(n) --- space - O(n) for only required row at given row
    //Time - O(n) --- space - O(1) for only required element at given row and col

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        List<Integer> row , pre = null;

        for(int i = 0 ; i<numRows ; i++){

            row = new ArrayList<>();

            for(int j = 0 ; j<=i ; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    row.add(pre.get(j-1) + pre.get(j));
                }
            }
            pre = row;
            res.add(row);
        }


        return res;
    }
}
