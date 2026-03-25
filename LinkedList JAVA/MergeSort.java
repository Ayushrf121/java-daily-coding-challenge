import java.util.Scanner;

public class MergeSort {
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
    public LL getMid(LL head)
    {
        LL slow = head;
        LL fast = head.next;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public LL mergeSort(LL head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        // mid
        LL mid = getMid(head);
        LL rHead = mid.next;
        mid.next = null;
        LL leftList = mergeSort(head);
        LL rightList = mergeSort(rHead);
        return merge(leftList,rightList);
    }
    public LL merge(LL head1,LL head2)
    {
        // dummy List pointing to -1 initially.
        LL dList = new LL(-1);
        LL temp = dList;
        while (head1!=null && head2!=null) {
            if(head1.data<head2.data)
            {
                temp.next = head1;
                head1=head1.next;
            }else{
                temp.next = head2;
                head2=head2.next;
            }
            temp = temp.next;
        }
        while (head1!=null) {
            temp.next = head1;
            head1=head1.next;
            temp = temp.next;
        }
        while (head2!=null) {
            temp.next = head2;
            head2=head2.next;
            temp = temp.next;
        }
        return dList.next;
    }
    public static void main(String[] args) {
         MergeSort ll = new MergeSort();
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
                    head = ll.mergeSort(head);
                    break;
                default:
                    System.out.println("No such choice exist!");
            }
        } while (ch<=3);
        sc.close();
    }
}
