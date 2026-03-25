public class MultiInheritance {
    public static void main(String[] args) {
        Bear baloo = new Bear();
        baloo.veg();
        baloo.nonVeg();
    }
}
interface Herbivorous
{
// public → accessible everywhere
// static → belongs to the interface, not to an object
// final → value cannot be changed
     int bamboo = 4;   // actually: public static final int bamboo = 4;
    void veg();
}
interface Carnivorous
{
    String meat = "4kg meat";
    void nonVeg();
}

class Bear implements Herbivorous,Carnivorous
{
    public void veg()
    {
        System.out.println("Bear can eat veg eg: "+Herbivorous.bamboo);
    }
    public void nonVeg()
    {
        System.out.println("Bear can eat Nonveg eg : "+Carnivorous.meat);
    }
}