
class ll {

    Node head;
    private int size;

    ll() {
        this.size = 0;
    }

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addfirst(String data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }
        
    public void addlast(String data) {

        Node newnode = new Node(data);
        if(head == null) {
            head = newnode;
            return;
        }

        Node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }

        currnode.next = newnode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currnode = head;
        while (currnode != null) { 
            System.out.print(currnode.data + " -> ");
            currnode = currnode.next;
        }

        System.out.println("NULL");
    }

    public void deletefirst() {
        if(head == null) {

            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void  deletelast() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next; 
        }

        secondLast.next = null;
    }

    public int getsize() {
        return size;
    }

    public static void main(String[] args) {
        ll list = new ll();

        list.addfirst("a");
        list.addfirst("is");
        list.printlist();

        list.addlast("list");
        list.printlist();

        list.addfirst("This");
        list.printlist();

        list.deletefirst();
        list.printlist();

        list.deletelast();
        list.printlist();

        System.out.println(list.getsize());
    }
}
