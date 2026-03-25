package TypeConversionJAVA;

public class TypeConversion {
    public static void main(String[] args) {
        // Type mismatch: cannot convert from double to int
        // int a =45.5;
        int a =45;
        // int -> float possible because of implicit typecasting
        float b=a;
        float d = 45.888f;
        // float -> int not possible directly 
        // int c =d;
        // lossy conversion
        int c =(int)d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // char->number : TypeConversion
        char ch = 'A';
        int x = ch;
        // float x = ch;
        // long x = ch;
        // short x = ch; Not possible
        // byte x = ch; Not possible

        System.out.println("character : "+ch+" number : "+x);
        float g = 458.5f;
        double h=g;
        System.out.println(h);
    }
}
