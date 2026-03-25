package TypePromotionJAVA;

public class TypePromotion {
    public static void main(String[] args) {
        char a ='A',b='B'; 
        System.out.println(a+b);
        System.out.println(a);

        int x = 10;
        float y= 50.55f;
        long l = 5888;
        double d = 39;
        double ans = x+y+l+d; // typePromotion take place by converting all of them in the double (x,y,l,d)
        // int ans = x+y+l+d; erro with it cant convert double -> int
        // int ans = (int)(x+y+l+d); type casting making it to convert
        System.out.println(ans);
    }
}
