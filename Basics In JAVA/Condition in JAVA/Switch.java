import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.err.print("Enter the choice : ");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Hey I am Ayush");
                break;
            case 2:
                System.out.println("Hey I am Ashish");
                break;
            default:
                System.out.println("Hey you have ended");
                break;
        }
        sc.close();
    }
}
