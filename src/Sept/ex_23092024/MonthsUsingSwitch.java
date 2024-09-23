package Sept.ex_23092024;

import java.util.Scanner;

public class MonthsUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number for which you want the name of the month");
        int num1 = input.nextInt();

        switch (num1){
            case 1:
                System.out.println("First month is Jan");
                break;
            case 2:
                System.out.println("First month is Feb");
                break;
            case 3:
                System.out.println("First month is Mar");
                break;
            case 4:
                System.out.println("First month is Apr");
                break;
            case 5:
                System.out.println("First month is May");
                break;
            case 6:
                System.out.println("First month is Jun");
                break;
            case 7:
                System.out.println("First month is Jul");
                break;
            case 8:
                System.out.println("First month is Aug");
                break;
            case 9:
                System.out.println("First month is Sep");
                break;
            case 10:
                System.out.println("First month is Oct");
                break;
            case 11:
                System.out.println("First month is Nov");
                break;
            case 12:
                System.out.println("First month is Dec");
                break;
            default:
                System.out.println("Please enter the number from 1-12");
                break;
        }

        input.close();
    }
}
