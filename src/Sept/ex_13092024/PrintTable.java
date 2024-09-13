package Sept.ex_13092024;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Table number");
        if(input.hasNextInt()){
            int num = input.nextInt();
            if(num < 0){
                System.out.println("Please enter a valid number");
                return;
            }
            for(int i =1 ;i <= 10;i++){
                System.out.printf("%d * %d = %d",num,i,num*i);
                System.out.println();
            }
        }
        else{
            System.out.println("Invalid Input");
        }

        input.close();


    }
}
