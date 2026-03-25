public class Paramerterized_Non_P {
    public static void main(String[] args) {
        // Overall this we say the Constructor Overloading and also the type of polymorphism
        School s2 = new School();
        School s1 = new School("Ayush",4000);
        System.out.println(s1.getStd() + " " + s1.getName());
        System.out.println(s2.getStd() + " " + s2.getName());
    }
}
class School
{
    private int std;
    String name;

    // Non Parameterised Constructor
    School()
    {
        System.out.println("Constructor was called!");
    }
    //  Parameterised Constructor
    School(String name,int std)
    {
        System.out.println("S1 called it....");
        this.name = name;
        this.std = std;
    }

    void setName(String name)
    {
        this.name = name;
    }
    void setStd(int std)
    {
        this.std = std;
    }
    int getStd()
    {
        return this.std;
    }
    String getName()
    {
        return this.name;
    }
}