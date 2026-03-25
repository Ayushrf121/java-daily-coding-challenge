public class CopyConstructor {
    public static void main(String[] args) {
        
        Data obj1 = new Data("Ayush", 19, "24151113");
        obj1.marks[0] = 95; 
        obj1.marks[1] = 89; 
        obj1.marks[2] = 76; 
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
        System.out.println(obj1.getPass());
        for(int i =0 ;i<obj1.marks.length;i++)
            {
                System.out.println(obj1.marks[i]);
            }
            
            Data obj2 = new Data(obj1); // only copy it had taken but in case of arrays it will get the reference of it.
            obj1.password = "12345678";
            obj1.marks[2] = 86;
            System.out.println("New Password obj1"+" "+obj1.getPass());
            System.out.println("New Marks of third student obj1"+" "+obj1.marks[2]);
            System.out.println(obj2.getName());
            System.out.println(obj2.getAge());
            System.out.println(obj2.getPass());
            System.out.println("Copy Array");
        for(int i =0 ;i<obj2.marks.length;i++)
        {
            System.out.println(obj2.marks[i]);
        }
    }
}

class Data
{
    String name,password;
    int age;
    int marks[];

    // Copy Constructor....
    Data(Data obj1)
    {
        marks = new int[3];
        System.out.println("\nCopy Constructor...");
        this.name = obj1.name;
        this.age = obj1.age;
        this.password = obj1.password;
        this.marks = obj1.marks;
    }
    String getName()
    {
        return this.name;
    }
    int getAge()
    {
        return this.age;
    }
    String getPass()
    {
        return this.password;
    }

    Data(String name,int age,String password)
    {
        System.out.println("Normal Constructor...");
        marks = new int[3];
        this.name = name;
        this.age = age;
        this.password = password; 
    }
}
