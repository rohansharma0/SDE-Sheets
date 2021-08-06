import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int tar = 9;

        int[] ans = twoSum(nums , tar);

        for(int e : ans){
            System.out.println(e);
        }



    }

//    Time - O(n) --- Space - O(n)

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        Map<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i< nums.length ; i++){

            int temp = target - nums[i];

            if(map.containsKey(temp)){
                ans[0] = i;
                ans[1] = map.get(temp);
                break;
            }else{
                map.put(nums[i],i);
            }

        }


        return ans;
    }

//    Time - O(n^2) - Space - O(1)
//
//    public static int[] twoSum(int[] nums, int target) {
//        int[] ans = new int[2];
//
//        for(int i = 0 ; i< nums.length ; i++){
//
//            int temp = target - nums[i];
//
//            for(int j = 0 ; j< nums.length ; j++){
//                if(i != j && temp == nums[j]){
//                    ans[1] = i;
//                    ans[0] = j;
//                }
//            }
//
//        }
//
//        return ans;
//    }

}
