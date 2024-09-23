package Sept.ex_23092024;

import java.util.Scanner;

public class ConversionFtoC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the Choice form below options");
        System.out.println("Choice 1: Conversion from Km to m");
        System.out.println("Choice 2: Conversion from Fahrenheit to Celsius");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Please enter the KM value ");
                double km = input.nextDouble();
                double m = km * 1000;
                System.out.printf("Coversion from KM to m of given value %.2f is %.2f meters",km,m);
                break;
            case 2:
                System.out.println("Please enter the Fahrenheit value");
                double f = input.nextDouble();
                double c = (f-32) * (5.0/9.0);
                System.out.printf("Coversion from Fahrenheit to celsius of given value %.2f is %.2f celsius",f,c);
                break;
            default:
                System.out.println("Please enter choice either 1 or 2");
        }
    }
}
