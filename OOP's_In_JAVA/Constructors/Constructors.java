public class Constructors
{
    public static void main(String[] args) {
        // if you do not have the constructor created in a class then it will get automatically invoked by the Java. in this we can also provide the values to the constructor that are even privately protected
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

    // Default Constructor
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