import java.util.ArrayList;

public class ReversePairs {


    //Time - O(n^2) --- Space - O(1)

//    public int reversePairs(int[] nums) {
//        int c = 0;
//
//        for(int i = 0 ; i< nums.length ; i++){
//            for(int j = i ; j < nums.length ; j++){
//                if(nums[i] > 2* nums[j]) c++;
//            }
//        }
//
//        return c;
//    }
    public static void main(String[] args) {

        int nums[] = {1,3,2,3,1};

        int c=  mergeSort(nums , 0 , nums.length - 1);
        System.out.println(c);
    }

    public static int mergeSort(int [] nums , int low , int high){

        if(low >= high) return 0;

        int mid = (low + high) / 2;

        int c = mergeSort(nums , low , mid);
        c += mergeSort(nums , mid+1 ,high);
        c += merge(nums , low, mid , high);

        return c;

    }

    public static int merge(int[] nums , int low , int mid , int high) {

//        int c = 0;
//
//        int j = mid + 1;
//
//        for (int i = low; k <= mid; k++) {
//
//            while (hi <= j && nums[k] > (2 * (long) nums[k])) {
//                hi++;
//            }
//
//            c += (hi - (mid + 1));
//
//        }


        ArrayList<Integer> temp = new ArrayList<>();

        int i = low;

        int j = mid + 1;

        while (i <= mid && j <= high) {

            if (nums[i] <= nums[]) {
                temp.add(nums[li++]);
            } else {
                temp.add(nums[ri++]);
            }

        }

        while (li <= mid) {
            temp.add(nums[li++]);
        }

        while (ri <= j) {
            temp.add(nums[ri++]);
        }

        for (int e = i; e <= j; e++) {
            nums[e] = temp.get(e - i);
        }

        return c;
    }

}
