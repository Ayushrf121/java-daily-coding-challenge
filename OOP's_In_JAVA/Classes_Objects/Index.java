// . Student Class (Basic)
// Create a class Student with:
// Data members: name, rollNo, course
// A method displayDetails()
// Create 2 objects and display their details.
// Concepts Covered: Class, Object, Instance Variables, Methods.
class Student {
    int rollNo;
    String name;
    String course;

    Student(int r, String name, String course) {
        this.name = name;
        this.course = course;
        this.rollNo = r;
    }

    public void displayDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Roll No. : " + this.rollNo);
        System.out.println("Course : " + this.course);
        System.out.println();
    }

}

// Bank Account (Constructor + this Keyword)

// Create a class BankAccount with:

// accountNumber
// accountHolderName
// balance

// Use a constructor to initialize all values using the this keyword.
// Create methods:
// deposit(double amount)
// withdraw(double amount)
// displayBalance()

// Concepts Covered: Constructor, this, Methods, Object Manipulation.
class Bank {
    int accNo;
    String accName;
    double balance;

    Bank(int accNo, String accname, double balance) {
        this.accName = accname;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount : " + amount + " is added successfully.");
        displayBalance();
        System.out.println();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
            displayBalance();
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Account Name : " + this.accName);
        System.out.println("Account No : " + this.accNo);
        System.out.println("Total Balance : " + this.balance);
        System.out.println();
    }
}

// 3. Employee Class (Encapsulation)

// Create a class Employee with private data members:

// empId
// name
// salary

// Provide:

// Setter methods
// Getter methods

// Create an object and access data only through getters and setters.

// Concepts Covered: Access Modifiers, Encapsulation, Getters and Setters.
class Employee {
    private int empId;
    private String name;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double sal) {
        this.salary = sal;
    }

    public double getSalary() {
        return salary;
    }
}

// Product Class (Static Members)
// Create a class Product with:
// productId
// productName
// price
// Also create a static variable:

// static int totalProducts = 0;

// Increment it whenever a new object is created.

// Display:

// Product details
// Total number of products created

// Concepts Covered: Static Variables, Constructors, Objects.
class Product{
    int productId;
    String productName;
    double price;
    static int totalProducts = 0;
    Product(int id,String name,double price){
        this.price = price;
        this.productName = name;
        this.productId = id;
        Product.totalProducts+=1;
    }
    public void details(){
        System.out.println(this.productName);
        System.out.println(this.price);
        System.out.println(this.productId);
    }
    public static void total(){
        System.out.println(Product.totalProducts);
    }
}

class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println();
    }
}
public class Index {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ayush Rawat", "BCA");
        Student s2 = new Student(2, "Rahul Pawar", "MCA");
        s1.displayDetails();
        s2.displayDetails();
        Bank obj1 = new Bank(24151113, "Ayush", 50000);
        obj1.displayBalance();
        obj1.deposit(4000);
        obj1.withdraw(6000);
        Employee emp = new Employee();

        emp.setEmpId(101);
        emp.setName("Ayush");
        emp.setSalary(45000);

        System.out.println(emp.getEmpId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());

        Product p1 = new Product(245, "Apple", 450);
        Product p2 = new Product(295, "Boat", 460);
        p1.details();
        p2.details();
        Product.total();

        Book books[] = new Book[5];

        books[0] = new Book(101, "Java Programming", "James Gosling");
        books[1] = new Book(102, "C Programming", "Dennis Ritchie");
        books[2] = new Book(103, "Python Basics", "Guido van Rossum");
        books[3] = new Book(104, "Data Structures", "Mark Allen");
        books[4] = new Book(105, "Web Development", "John Smith");

        System.out.println("Book Details:\n");

        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}