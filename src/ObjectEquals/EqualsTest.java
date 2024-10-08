package ObjectEquals;

public class EqualsTest {
    public static void main(String[] args) {

        Person person1 = new Person("vijay",43,"23");
        Person person2 = new Person("vijay",46,"23");

        System.out.println(person1.equals(person2));
    }
}
