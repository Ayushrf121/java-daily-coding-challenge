import java.util.Scanner;

public class PalindromeLL {
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
    public LL findMid()
    {
        LL slow = head;
        LL fast = head;
        while (fast!=null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome()
    {
        if(head==null || head.next==null)
        {
            return true;
        }
        LL midNode = findMid();
        // reverse the 2nd half.
        LL prev = null;
        LL curr = midNode;
        LL next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        LL head2 = prev;
        LL head1 = head;
        while (head2!=null) {
            if(head1.data != head2.data)
            {
                return false;
            }
            head1=head1.next;
            head2=head2.next;
        }
        return true; 
    }
    public static void main(String[] args) {
        PalindromeLL ll = new PalindromeLL();
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
                    System.out.println(ll.isPalindrome());
                    break;
                default:
                    System.out.println("No such choice exist!");
            }
        } while (ch<=3);
        sc.close();
    }
}
