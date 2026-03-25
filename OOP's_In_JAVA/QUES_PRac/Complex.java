// WAP to add,sub,product two complex numbers.

import java.util.Scanner;

public class Complex
{
    int real,img;
    public Complex(int r, int i)
    {
        this.real = r;
        this.img = i;
    }
    public static Complex sum(Complex obj1,Complex obj2)
    {
        Complex temp = new Complex(0, 0);
        temp.real = obj1.real + obj2.real ;
        temp.img = obj1.img + obj2.img ;
        return temp;
    }
    public static Complex sub(Complex obj1,Complex obj2)
    {
        Complex temp = new Complex(0, 0);
        temp.real = obj1.real - obj2.real;
        temp.img = obj1.img - obj2.img;
        return temp;
    }
    public static Complex multiply(Complex obj1,Complex obj2)
    {
        Complex temp = new Complex(0, 0);
        temp.real = obj1.real * obj2.real;
        temp.img = obj1.img * obj2.img;
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,i;
        System.out.println("Enter real and img no. for obj1");
        r=sc.nextInt();
        i=sc.nextInt();
        Complex obj1 = new Complex(r,i);
        System.out.println("Enter real and img no. for obj2");
        r=sc.nextInt();
        i=sc.nextInt();
        Complex obj2 = new Complex(r,i);
        Complex add = sum(obj1,obj2);
        Complex difference = sub(obj1,obj2);
        Complex product = multiply(obj1,obj2);
        System.out.println(add.real+"+"+add.img+"i");
        System.out.println(difference.real+"+"+difference.img+"i");
        System.out.println(product.real+"+"+product.img+"i");
        sc.close();
    }
}

