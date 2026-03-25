import java.util.Scanner;

public class RemoveFromLast {
    class LL{
        int data;
        LL next;
        LL(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static LL head;
    public void addLast(int data)
    {
        LL newNode = new LL(data);
        if(head==null)
        {
            head = newNode;
            return;
        }else if(head.next==null)
        {
            head.next = newNode;
            return;
        }
        LL temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        temp = newNode;

    }
    public void printVal()
    {
        if(head == null)
        {
            System.out.println("No data exist");
            return;
        }
        LL temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public void removeElement(int n)
    {
       if(head==null)
       {
        return;
       }
       LL temp = head;
       int size=0;
       while (temp!=null) {
        temp = temp.next;
        size++;
       }
       if(n>size)
       {
        return;
       }
       if(n==size)
       {
        head=head.next;
        return;
       }
       int i=1;
       LL prev = head;
       while (i<(size-n)){
        prev = prev.next;
        i++;
       }
       prev.next = prev.next.next;
    }
    public static void main(String[] args) {
        RemoveFromLast ll = new RemoveFromLast();
        Scanner sc = new Scanner(System.in);
        int ch,data;
        do {
            System.out.print("Enter the choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the Data : ");
                    data = sc.nextInt();
                    ll.addLast(data);
                    break;
                case 2:
                    ll.printVal();
                    break;
                case 3:
                    System.out.print("Enter the node to remove : ");
                    data = sc.nextInt();
                    ll.removeElement(data);
                    break;
                default:
                    System.out.println("No such choice exist!");
            }
        } while (ch<=3);
        sc.close();
    }
}
