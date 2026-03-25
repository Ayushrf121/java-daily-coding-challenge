import java.util.Scanner;

public class RemoveCycle {
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
    
    public void  removeCycle()
    {
        LL slow = head; 
        LL fast = head;
        boolean call = false;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                call = true;
                break;
            }
        }
        if(call==true)
        {
            slow = head;
            LL prev = null;
            while (slow!=fast) {
                prev = fast;
                slow=slow.next;
                fast=fast.next;
            }
            prev.next=null;
        }
    }
    public void printVal()
    {
        LL temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }
    
    public void addVal(int data){
        LL newNode = new LL(data);
        if(head==null)
        {
            head = newNode;
            return;
        }
        if(head.next==null)
        {
            head.next = newNode;
            return;
        }
        if(head.next.next==null)
        {
            head.next.next = newNode;
            head.next.next.next = head.next;
            return;
        }
    }
    public static void main(String[] args) {
        RemoveCycle ll = new RemoveCycle();
        ll.addVal(45);
        ll.addVal(55);
        ll.addVal(65);
        ll.removeCycle();
        ll.printVal();
    }
}
