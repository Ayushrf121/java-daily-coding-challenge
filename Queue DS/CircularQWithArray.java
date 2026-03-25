public class CircularQWithArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr = new int[n];
            size = n;
            front =-1;
            rear =-1;
        }
        
        // add O(1)
        public static void addInQueue(int data){
            if((rear+1)%size == front){
                System.out.println("Queue is Full");
                return;
            }
            if(front ==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
            return;
        }
        // remove O(1)
        public static int remove()
        {
            if(front ==-1){
                System.out.println("Queue is Empty!");
            }
            int r = arr[front];
            if(front==rear){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return r;
        }
        // peek O(1)
        public static int peek(){
            if(front==-1){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.addInQueue(10);
        q.addInQueue(20);
        q.addInQueue(30);
        System.out.println("Removed:"+q.remove());
        q.addInQueue(40);
        System.out.println("Removed:"+q.remove());
        q.addInQueue(50);
        System.out.println("Removed:"+q.remove());
        System.out.println("Removed:"+q.remove());

        while (q.front!=-1) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}