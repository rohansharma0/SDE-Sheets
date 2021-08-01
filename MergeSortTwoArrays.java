public class MergeSortTwoArrays {


//    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]
//    Time - O(n) --- Space - O(1);

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m-1; // pointer to 1st array last element
        int p2 = n-1; // pointer to 2ns array last element
        int i = nums1.length-1; // pointer to 1st array last empty index

        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1]> nums2[p2]){
                nums1[i--] = nums1[p1--];
            }else{
                nums1[i--] = nums2[p2--];
            }
        }

    }
//    Time - O(n) --- Space - O(m+n);
//
//    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
//
//
//        int[] res = new int[a.length + b.length];
//
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while(i < a.length && j < b.length){
//            if(a[i] < b[j]){
//                res[k++] = a[i++];
//            }else{
//                res[k++] = b[j++];
//            }
//        }
//
//        while(i < a.length){
//            res[k++] = a[i++];
//        }
//        while(j < b.length){
//            res[k++] = b[j++];
//        }
//        return res;
//    }
}
