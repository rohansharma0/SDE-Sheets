public class RotateLinkedListwithK {

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0) return head;

        //find length and place a pointer to last
        int len = 1;
        ListNode curr = head;

        while(curr.next != null){
            len++;
            curr = curr.next;
        }

        curr.next = head;

        k = len - k % len;


        while(k -- > 0){
            curr = curr.next;
        }

        head = curr.next;
        curr.next = null;

        return head;

    }

}
