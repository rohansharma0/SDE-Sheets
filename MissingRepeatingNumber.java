public class MissingRepeatingNumber {

    public static void main(String[] args) {


//      Time - O(n) --- Space - O(n)

        int[] nums = {4,3,6,2,1,1};

        int n = 6;

        int missingNo = 0;
        int repeatingNo = 0;

        int[] arr = new int[n+1];

        for(int i = 0 ; i<nums.length ; i++){
            arr[nums[i]]++;
        }

        for(int i = 1;i< arr.length ; i++){
            if(arr[i] == 0){
                missingNo = i;
            }
            if(arr[i] > 1){
                repeatingNo = i;
            }
        }

        System.out.println(missingNo);
        System.out.println(repeatingNo);

    }

}
