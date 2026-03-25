public class QueueWithArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear =-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        // add O(1)
        public static void addInQueue(int data){
            if(rear==size-1){
                System.out.println("Queue is Full");
                return;
            }
            rear = rear+1;
            arr[rear] = data;
            return;
        }
        // remove O(n)
        public static int remove()
        {
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear = rear-1;
            return front;
        }
        // peek O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.addInQueue(10);
        q.addInQueue(20);
        q.addInQueue(30);
        q.addInQueue(40);
        q.addInQueue(50);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
