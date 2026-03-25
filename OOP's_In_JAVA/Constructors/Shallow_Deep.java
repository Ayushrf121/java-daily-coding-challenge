public class Shallow_Deep {
    public static void main(String[] args) {
        int[] m = { 90, 80, 70 };
        Student s1 = new Student(1, m);
        Student s2 = new Student(s1);

        s1.marks[0] = 50;
        System.out.println(s2.marks[0]); // 50 😮

        // s1.marks and s2.marks point to the same array
        // Change in one → reflected in the other
        // 📌 Shallow copy = shared memory for reference variables

        System.out.println(s2.marks[0]); // 90 ✅

        // s2.marks is a new array
        // Both objects are completely independent
        // 📌 Deep copy = separate memory

    }
}

class Student {
    int id;
    int[] marks;

    // 1️⃣ Shallow Copy (Constructor)
    // Definition:
    // A shallow copy constructor copies the references, not the actual data inside
    // referenced objects.

    // Shallow copy constructor

    // Student(Student s) {
    // this.id = s.id;
    // this.marks = s.marks; // same array reference
    // }

    // 2️⃣ Deep Copy (Constructor)
    // Definition:
    // A deep copy constructor creates new objects for all referenced data.

    // Deep copy constructor

    Student(Student s) {
        this.id = s.id;
        this.marks = new int[s.marks.length];
        for (int i = 0; i < s.marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }

    Student(int id, int[] marks) {
        this.id = id;
        this.marks = marks;
    }
}
