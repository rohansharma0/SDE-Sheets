import java.util.*;

public class FourSum {

    public static void main(String[] args) {

        int [] nums = {1,0,-1,0,-2,2};
        int tar = 0;

        List<List<Integer>> ans = fourSum(nums , tar);

        System.out.println(ans);

    }


    //Time - O(n^3) --- Space - O(1)

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();

        if(nums == null || nums.length == 0) return res;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length ; i++){

            for(int j = i+1 ; j<nums.length ; j++){

                int li = j +1;
                int ri = nums.length -1;

                int temp = target - nums[i] - nums[j];

                while(li < ri){

                    int twoSum = nums[li] + nums[ri];

                    if(twoSum < temp){

                        li++;

                    }else if(twoSum > temp){

                        ri--;

                    }else{

                        List<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[li]);
                        arr.add(nums[ri]);

                        res.add(arr);

                        // processing the duplicate at li and ri

                        while(li < ri && nums[li] == arr.get(2)) ++ li;


                        while(li < ri && nums[ri] == arr.get(3)) --ri;


                    }

                }

                // processing the duplicate at j index
                while(j + 1 < nums.length && nums[j+1] == nums[j]) ++j;

            }

            // processing the duplicate at i index
            while(i  + 1 < nums.length && nums[i+1] == nums[i]) ++i;

        }

        return res;

    }

}
