// method overriding says Parent in child class both contain the same function with different definitions likewise in this example you can see that we have created Animal and Doc class but since we have created object of the Doc class that's why the function of that class will call If we create Animal class then definitely its function eat will called
public class MethodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

class Animal
{
    void eat()
    {
        System.out.println("Animal can Eat!");
    }
}

class Dog extends Animal
{
    void eat()
    {
        System.out.println("Dogs can Eat!");
    }
}