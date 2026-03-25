
public class DoublyLL
{
    class Node{
        int data;
        Node prev;       
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node head;
    public static int size;
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return;
    }
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return;
    }
    public void removeFirst()
    {
        if(head==null)
        {
            System.out.println("No nodes to remove!");
            return;
        }
        if(head.next == null)
        {
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
        System.out.println(head.data+" is new head");
    }
    public void removeLast()
    {
        if(head==null)
        {
            System.out.println("No nodes to remove!");
            return;
        }
        if(head.next == null)
        {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next.prev = null;
        temp.next = null;
        size--;
        System.out.println(temp.data+" is new last node!");
    }
    public void printVal()
    {
        if(head==null)
        {
            System.out.println("No nodes in a list");
            return;
        }
        
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLL li = new DoublyLL(); 
        // li.addFirst(3);   
        // li.addFirst(2);   
        // li.addFirst(1);

        li.addLast(11);
        li.addLast(22);
        li.addLast(33);
        li.printVal();
        System.out.println(size);   
        li.removeFirst();
        li.printVal();
        System.out.println(size); 
        li.removeLast();
        li.printVal();
        System.out.println(size); 
    }
}