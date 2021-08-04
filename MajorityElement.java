public class MajorityElement {

    //Moore's Voting Algorithm

    //Time - O(n) -- Space -O(1)

    public int majorityElement(int[] nums) {

        int cn = 0;

        int el = 0;

        for(int e : nums){
            if(cn == 0){
                el = e;
            }
            if(el == e){
                cn++;
            }else{
                cn--;
            }
        }

        return el;

    }
}
