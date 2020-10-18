package exception.handling;

public class HandleException {
    public static void main(String[] args) {

        int number = 10;
        int result = number/0;
        System.out.println("Result is " + result);
   //syntax is correct but it is not correct during runtime
        // once it hits exception the program will quit without try catch method

    }

}