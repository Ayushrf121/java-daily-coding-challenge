import java.util.Scanner;

public class RecursiveSearch {
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
    public int helper(LL head , int data)
    {
        if(head == null)
        {
            return -1;
        }
        if(head.data == data)
        {
            return 0;
        }
        int index = helper(head.next, data);
        if(index == -1)
        {
            return -1;
        }
        return index+1;
    }
    public int searchData(int data)
    {
        return helper(head, data);
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
        RecursiveSearch ll = new RecursiveSearch();
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
                    System.out.println(ll.searchData(65));
                    break;
            }
        } while (ch<=3);
        sc.close();
    }
}
