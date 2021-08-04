import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {

    public static void main(String[] args) {

        int[] nums = {2,1,1,3,1,4,5,6};

        List<Integer> ans = majorityElement(nums);

        System.out.println(ans);
    }

    //Moore's Voting Algorithm

    //Time - O(n) - Space - O(1)

    public static List<Integer> majorityElement(int[] nums) {

        List<Integer> res = new ArrayList<>();

        int n1 = -1;
        int n2 = -1;

        int c1 = 0;
        int c2 = 0;

        for(int e : nums){

            if(n1 == e){
                c1++;
            }else if(n2 == e){
                c2++;
            }else if(c1 == 0){
                n1 = e;
                c1 = 1;
            }else if(c2 == 0){
                n2 = e;
                c2 = 1;
            }
            else{
                c1--;
                c2--;
            }

        }

        c1 = 0;
        c2 = 0;

        for(int e : nums){
            if(e == n1) c1++;

            else if(e == n2) c2++;
        }

        if(c1 > nums.length / 3)
            res.add(n1);

        if(c2 > nums.length / 3)
            res.add(n2);

        return res;

    }
}
