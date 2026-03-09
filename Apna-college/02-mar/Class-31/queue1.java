
public class queue1 {

    static class queue {

        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        @SuppressWarnings("static-access")
        queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isempty() {
            return rear == -1 && front == -1;
        }

        public static boolean isfull() {
            return (rear+1) % size == front;
        }

        public static void add(int data) {
            if (isfull()) {
                System.out.println("full queue");
                return;
            }

            if(front == -1) {
                front = 0;
            }

            rear = (rear+1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isempty()) {
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];

            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size; 
            }

            return result;
        }

        public static int peek() {

            if(isempty()) {
                System.out.println("empty queue");
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        System.out.println();       


        while(!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }
    } 
}
