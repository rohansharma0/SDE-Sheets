public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {

        ListNode s = head , f = head , e = head;

        if(head == null || head.next == null) return null;

        while(f.next != null && f.next.next != null){

            s = s.next;
            f = f.next.next;

            if(s == f){

                while(e != s){
                    s = s.next;
                    e = e.next;
                }

                return e;

            }

        }

        return null;

    }
}
