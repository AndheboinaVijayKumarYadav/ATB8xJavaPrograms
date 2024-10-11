package PassbyValueReference;

public class TestPassByValue {
    public static void main(String[] args) {
        int x = 4;
        int y = 6;
        // here in add we are passing the copy of x and y values
        int sum = add(x,y);

        // here original data types value is not changing i.e. x and y are not change
        // irrespective what happens in the add method

        System.out.printf("x = %d, y = %d , x + y = %d",x,y,sum);

    }

    public static int add(int a,int b){
        a +=b;
        // a = 100;
        return a;
    }
}
