public class Abs {
    public static void main(String[] args) {
        // Animal a = new Animal(); not possible
        // Dog d= new Dog();
        // d.eat();
        // d.walk();
        // Birds b = new Birds();
        // b.eat();
        // b.walk();
        Falcon f = new Falcon();
        
    }
}

// no instances, have abs. methods/non abs. methods, can have constructors//
// abs. class cons. always get a call first then the inherited clas cons.
// wants to assign parameter then use super().
abstract class Animal
{
    Animal(){
        System.out.println("I am a constructor of Animal!");
    }
    void eat()
    {
        System.out.println("Can eat!");
    }
    // Abstract methods do not specify a body
    abstract void walk();
}
// The type dog must implement the inherited abstract method Animal.walk()
class Dog extends Animal
{
    Dog(){
        // assigning parameter to the Animal class.
        // super(x);
        System.out.println("I am cons. of Dog!");
    }
    void walk()
    {
        System.out.println("Dog walks on 4 legs.");
    }

}
class Birds extends Animal
{
    Birds(){
        // super(x);
        System.out.println("I am cons. of Birds!");
    }
    void walk()
    {
        System.out.println("Birds walks on 2 legs!");
    }
}
class Falcon extends Birds
{
    Falcon(){
        System.out.println("I am cons. of falcon");
    }
}