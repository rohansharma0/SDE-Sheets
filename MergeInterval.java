import java.util.*;

public class MergeInterval {

//    Time - O(nlogn) for sorting + O(n)

    public int[][] merge(int[][] intervals) {

        List<int[]> res = new ArrayList<>();

        if(intervals.length == 0 || intervals == null){
            return res.toArray(new int[0][]);
        }

        Arrays.sort(intervals , Comparator.comparingInt(a -> a[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] i : intervals){
            if(i[0] <= end){
                end = Math.max(i[1] , end);
            }else{
                res.add(new int[]{start , end});
                start = i[0];
                end = i[1];
            }
        }

        res.add(new int[]{start , end});

        return res.toArray(new int[0][]);
    }

    //Time - O(nlogn) for sorting + O(n)
    //Using Stack and Pair Class

    public static void mergeOverlappingIntervals(int[][] arr) {

        Pair[] pairs = new Pair[arr.length];

        for(int i = 0; i< arr.length ; i++){

            pairs[i] = new Pair(arr[i][0] , arr[i][1]);

        }


        Arrays.sort(pairs);

        Stack<Pair> st = new Stack<>();

        for(int i = 0; i< pairs.length ; i++){

            if(i == 0){
                st.push(pairs[i]);
            }else{

                Pair top = st.peek();

                if(pairs[i].st > top.et){
                    st.push(pairs[i]);
                }else{
                    top.et = Math.max(top.et , pairs[i].et);
                }

            }

        }

        Stack<Pair> res = new Stack<>();

        while(st.size() > 0){
            res.push(st.pop());
        }

        while(res.size() > 0){
            Pair top = res.pop();

            System.out.println(top.st + " " + top.et);
        }
    }
}

class Pair implements Comparable<Pair> {

    int st;
    int et;


    Pair(int st , int et){
        this.st = st;
        this.et = et;
    }


    // this > other --> +ve
    // this == other ---> 0
    //this < other --> -ve
    @Override
    public int compareTo(Pair o) {
        if(this.st != o.st){
            return this.st - o.st;
        }else{
            return this.et - o.et;
        }

    }




}
