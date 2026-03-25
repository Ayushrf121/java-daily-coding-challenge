
public class QueueWithLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        public static void addInQueue(int data) {
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            return;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue(List) is empty!");
                return -1;
            }
            int result = head.data;
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue(List) is empty!");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.addInQueue(45);
        q.addInQueue(55);
        q.addInQueue(65);
        q.addInQueue(75);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
