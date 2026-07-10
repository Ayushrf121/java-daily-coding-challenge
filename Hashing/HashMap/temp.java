import java.util.LinkedList;

public class temp {
    public static void main(String[] args) {
        // LinkedList<Integer> li = new LinkedList<>();
        // li.add(45);
        // li.addFirst(78);
        // li.addLast(55);
        // li.add(1,20);
        // System.out.println(li.get(1));
        LinkedList<Integer> arr[]= new LinkedList[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new LinkedList<>();
        }
        arr[0].add(45);
        arr[0].addFirst(75);
        arr[0].addLast(85);
        arr[0].add(1,45);

        arr[1].add(45);
        arr[1].addFirst(75);
        arr[1].addLast(85);
        arr[1].add(1,45);
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i].isEmpty()){
                while (!arr[i].isEmpty()) {
                    System.out.print(arr[i].remove()+" ");
                }
            }
            else{
                System.out.println("Index "+i+"is empty"+arr[i]);
            }
            System.out.println();
        }
    }
}
