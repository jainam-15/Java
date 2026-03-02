
import java.util.*;

class remove {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        int ptf = size - n; 
        ListNode prev = head; 
        int cp = 1; 

        while (cp != ptf) {
            prev = prev.next;
            cp++;
        }

        prev.next = prev.next.next;
        return head;
    }

}
