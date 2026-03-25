// Encapsulation means combining data and the functions that work on that data into a single unit, like a class. In Object-Oriented Programming, it helps keep things organized and secure.
public class Encap
{
    public static void main(String [] args)
    {
        Programmer p = new Programmer();
        p.setName("Geek");
        System.out.println("Name=> " + p.getName());
    }
}

class Programmer {

    private String name;

    // Getter method used to get the data
    public String getName() { return name; }

    // Setter method is used to set or modify the data
    public void setName(String name) {
        
        this.name = name;
    }
}

// we use the encapsulation and use getter (getName) and setter (setName) method which are used to show and modify the private data. This encapsulation mechanism protects the internal state of the Programmer object and allows for better control and flexibility in how the name attribute is accessed and modified.