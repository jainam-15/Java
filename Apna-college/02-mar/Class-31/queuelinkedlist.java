
public class queuelinkedlist {

    static class node {
        int data;
        node next;
        
        node(int data) {
            this.data  = data;
            next = null;
        }
    }
    static class queue {

        static node head = null;
        static node tail = null;
        

        public static boolean isempty() {
            return head == null && tail == null;
        }

        public static void add(int data) {

            node newnode = new node(data);
            if(tail == null) {
                tail = head = newnode;
                return;
            }

            tail.next = newnode;
            tail = newnode;
        }

        public static int remove() {
            if (isempty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if(head == tail) {
                tail = null;
            }
            head = head.next;

            return front;
        }

        public static int peek() {

            if (isempty()) {
                System.out.println("empty queue");
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        queue q = new queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
