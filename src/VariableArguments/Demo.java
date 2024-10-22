package VariableArguments;

public class Demo {
    public static int Sum(int... elements){
        int sum = 0;
        for(int element: elements){
            sum += element;
        }
        return sum;
    }
    // in main method also ... is allowed
    public static void main(String... args) {
        int sum = Sum(1,2,3,5,64,9);
        System.out.println(sum);
    }
}
