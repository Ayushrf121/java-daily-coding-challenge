import java.util.ArrayList;

public class StackArrayList{
    static class Stack{
        static ArrayList<Integer> li = new ArrayList<>();
        public boolean isEmpty(){
            return li.size() == 0;
        }
        public void push(int data){
            li.add(data);
            System.out.println("Data added to the List = "+data);        
        }
        public int pop(){
            if(li.isEmpty()){
                return -1;
            }
            int top=li.get(li.size()-1);
            li.remove(li.size()-1);
            return top;
        }
        public int peek(){
            if(li.isEmpty()){
                return -1;
            }
            return li.get(li.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack sc = new Stack();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(4);
        System.out.println(sc.peek());
        System.out.println("ALL DATA");
        while (!sc.isEmpty()) {
            System.out.println(sc.pop());
        }
    }
}