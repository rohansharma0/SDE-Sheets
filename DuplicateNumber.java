public class DuplicateNumber {
    public int findDuplicate(int[] nums) {

//        Time - O(n) --- Space - O(n)
//
//        int[] arr = new int[nums.length];
//        int n = 0;
//
//        for(int i = 0 ; i< nums.length ; i++){
//            if(arr[nums[i]] != 0){
//                n = nums[i];
//                break;
//            }
//            arr[nums[i]]++;
//        }
//
//        return n;

//        Time - O(n) --- Space - O(1)

        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        fast = nums[0];

        while(fast != slow){
            fast = nums[fast];
            slow = nums[slow];
        }

        return slow;
    }
}
