package Sept.ex_05102024;

public class Student {

    // instance variables , data members, properties and attributes
    String name;
    int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        // Created a reference to object
        Student vijay = new Student("Vijay",27);
        // calling toString method explicitly
        System.out.println(vijay.toString());

        // printing the vijay will implicitly call the toString method
        System.out.println(vijay);
    }
}
