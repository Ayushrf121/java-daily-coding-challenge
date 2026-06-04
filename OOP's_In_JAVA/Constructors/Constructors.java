// Types of Constructors.
class Type1{
    Type1(){
        System.out.println("I am a default constructor!");
    }
}
class Type2{
    Type2(){
        System.out.println("I am type2 DC");
    }
    Type2(int x){
        System.out.println("Value of x : "+x);
    }
}
class Type3{
    int x;
    float y;
    Type3(int x, float y){
        this.x = x;
        this.y = y;
    }
    // copy constructor.
    Type3(Type3 obj){
        this.x = obj.x;
        this.y = obj.y;
    }
    public void details(int x){
        if(x==0){
            System.out.println("Copy is calling");
        }else{
            System.out.println("original is calling");
        }
        System.out.println(this.x);
        System.out.println(this.y);
    }
}
public class Constructors {
    public static void main(String []args){
        // Called automatically when obj. created.
        Type1 obj = new Type1();
        // if it was empty it will call the DC cuz of its prop.
        // but since the it was parameterized so it called next Const.
        Type2 obj2 = new Type2(45);
        Type3 data1 = new Type3(45, 89.9f);
        Type3 data2 = new Type3(data1);
        data2.details(0);
        data1.x = 10;
        data1.y = 20;
        data1.details(1);
        data2.details(0);
    }
}
