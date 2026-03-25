import java.util.Scanner;

public class Basics {
    Basics() {
        System.out.println("<!----------------------Linked List------------------!>");
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public  int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int index,int data)
    {
        if(index == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while (i<index-1) {
            temp =temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst()
    {
        if(head == null)
        {
            return;
        }
        System.out.println(head.data);
        head = head.next;
        return;
    }

    public void removeLast()
    {
        if(tail==null)
        {
            return;
        }
        if(head.next==null)
        {
            System.out.println(head.data);
            head = tail = null;
        }
        Node temp = head;
        while (temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next = tail.next;
        tail = temp;

    }

    public int size()
    {
        int i=0;
        if (head==null) {
            return i;
        }
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
            i++;
        }
        return i;
    }
    public void printList()
    {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Basics ll = new Basics();
        int data;
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
             System.out.print("Enter No: ");
            ch = sc.nextInt();
            switch (ch) {
            case 1:
                System.out.print("Enter data : ");
                data = sc.nextInt();
                ll.addFirst(data);
                break;
            case 2:
                System.out.print("Enter data : ");
                data = sc.nextInt();
                ll.addLast(data);
                break;
            case 3:
                System.out.print("Enter data : ");
                data = sc.nextInt();
                System.out.print("Enter index : ");
                int idx = sc.nextInt();
                ll.addMiddle(idx,data);
                break;
            case 4:
        System.out.println(ll.size());
                break;
            case 5:
                ll.removeFirst();
                break;
            case 6:
                ll.printList();
                break;
            case 7:
                ll.removeLast();
        }
        } while (ch<=7);
      
    }
}
