public class StackLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static class Stack{
        public void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                System.out.println("head : "+head.data);
                return;
            }
            // Using the new Node as a head;
            newNode.next = head;
            head = newNode;
            System.out.println("New head value : "+head.data);
            return;
        }
        public void pop(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            System.out.println("Value To Be Popped Out = "+head.data);
            head = head.next;
            return;
        }
        public void display(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("NULL");
            return;
        }
        public void peek(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            System.out.println("Peek Value = "+head.data);
        }
    }

    public static void main(String[] args) {
        Stack sc = new Stack();
        sc.push(2);
        sc.push(3);
        sc.push(4);
        sc.push(5);
        sc.peek();
        sc.pop();
        sc.peek();
        sc.display();
    }
}
