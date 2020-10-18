package exception.handling;

import java.util.Scanner;

public class TryCatchExceptionHandling {

    public static void main(String[] args) {
        System.out.println("Please enter your dividend number:");
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        System.out.println("Please enter your divisor number:");
        int divisor = sc.nextInt();
        try {
            int result = (dividend/divisor);
            System.out.println("Your result is: " + result);

        }catch(Exception error) {
            //error.printStackTrace(); java exception message
            System.out.println("You cannot divide by zero you hit the catch error");
        }
        System.out.println("This should come if there is no error or you're using try/catch method");
//catch will catch the error and continue running the program
        sc.close();
    }
}
