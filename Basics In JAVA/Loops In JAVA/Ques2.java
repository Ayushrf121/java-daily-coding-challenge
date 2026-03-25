// Reverse the number.

public class Ques2 {
    public static void main(String[] args) {
        // n = 10899 // 99801//
        int n = 10899;
        int l=0,r=0;

        while (n != 0) {
            l = n % 10; // 9 // 9 // 8 // 0 // 1
            r = l + r * 10; // 9 // 99 // 998 // 9980 // 99801
            n = n / 10;
        }
        System.out.println(r);
    }
}
