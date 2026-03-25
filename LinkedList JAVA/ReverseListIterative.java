import java.util.Scanner;

public class ReverseListIterative {
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
    public void reverseList(){
        if(head==null || head.next==null)
        {
            return;
        }
        else if(head.next.next==null)
        {
            head.next.next = head;
            head.next = null;
            return;
        }
        LL prev = head;
        LL curr = head.next;
        LL next ;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
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
    public static void main(String[] args) {
        ReverseListIterative ll = new ReverseListIterative();
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
                    ll.reverseList();
                    break;
            }
        } while (ch<=3);
    }
}
