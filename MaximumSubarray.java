public class MaximumSubarray {

//    Time - O(n^2)
//
//    public int maxSubArray(int[] nums) {
//
//        int max = Integer.MIN_VALUE;
//
//        for(int i = 0 ; i<nums.length ; i++){
//
//            int sum = 0;
//
//            for(int j = i ; j < nums.length ;j++){
//                sum += nums[j];
//
//                if(sum > max){
//                    max = sum;
//                }
//            }
//
//
//        }
//
//        return max;
//    }


//    Time - O(n)
//    Kadane's Algorithm
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int e : nums){
            sum += e;

            if(sum > max){

                max = sum;
            }

            if(sum < 0) sum = 0;
        }

        return max;

    }
}
