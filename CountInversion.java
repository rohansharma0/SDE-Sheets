import java.util.Arrays;

public class CountInversion {

//    Time - O(n^2)
//
//    public static int countInversion(int[] arr){
//
//        int c = 0;
//
//        for(int i = 0; i<arr.length-1 ; i++){
//
//            for(int j = i + 1 ; j < arr.length ; j++){
//
//                if(arr[i] > arr[j]){
//                    c++;
//                }
//            }
//
//        }
//
//        return c;
//
//    }

//    By Using MergeSort Time -- O(nlogn)

    public static int mergeAndCount(int[] arr, int l,int m, int r){
        // Left array
        int[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right array
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l, c = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                c += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return c;
    }

    public static int mergeSortAndCount(int[] arr, int l,int r){
        int c = 0;

        if (l < r) {
            int m = (l + r) / 2;
            c += mergeSortAndCount(arr, l, m);

            c += mergeSortAndCount(arr, m + 1, r);

            c += mergeAndCount(arr, l, m, r);
        }

        return c;
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 1};

        int c = mergeSortAndCount(arr, 0, arr.length - 1);

        System.out.println(c);
    }
}

