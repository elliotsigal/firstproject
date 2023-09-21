// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int correct = 0;
        int wrong = 0;

       System.out.println("Welcome to the brand new CST");
        try {
            Thread.sleep(5000); // 2000ms = 2s
        } catch (InterruptedException ex) {

        }
       System.out.println("Let's start");
        System.out.println("Pick a difficulty: 1) Hard 2) Medium 3) Easy: ");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        boolean on = true;
        if (option == 1) {
            System.out.println("Wow, let's see how smart you really are!");
            while ( on) {
                while( on ){ // first number input
                    System.out.println("Enter the first number. ");
                    int answer1 = scan.nextInt();
                    if ( answer1 < -2147483647 || answer1 > 2147483647 ) {
                        System.out.println("First number is out of range, try again. (Must be a valid 32-bit integer");
                        System.out.println("This one is tricky i'll give you another try");

                    } else {
                        if (answer1 !=2147483647) {
                            wrong++;
                            on = false;
                        } else {
                            System.out.println("Correct");
                            correct++;
                            on = false;


                        }
                    }

                    }
                }

            }

    }
}