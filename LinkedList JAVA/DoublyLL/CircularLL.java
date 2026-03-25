public class CircularLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static int size;

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
        return;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        temp = newNode;
        temp.next = head;
        // printVal();
        return;
    }

    public void printVal() {
        if (head == null) {
            System.out.println("No nodes in a list");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        } while (temp != head);
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        CircularLL li = new CircularLL();
        // li.addLast(11);
        // li.addLast(22);
        // li.addLast(33);

        li.addFirst(1);
        li.addFirst(2);   
        li.addFirst(3);   
        li.printVal();
        System.out.println(size);
    }
}
