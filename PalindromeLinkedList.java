public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {


        ListNode s = head , f = head;

        while(f != null && f.next != null){

            s = s.next;
            f = f.next.next;

        }

        if(f != null){
            s = s.next;
        }

        //reverse

        s = reverse(s);
        f = head;

        while(s != null){

            if(s.val != f.val){
                return false;
            }else{
                f = f.next;
                s = s.next;
            }
        }

        return true;


    }

    public ListNode reverse(ListNode head){

        ListNode prev = null;

        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;

    }
}
