import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to The Calculator");
        boolean quit = false;
        final double pie = 3.14;
        while (quit == false) {
            System.out.println("");
            System.out.print("Please pick an option: 1) Division, 2) Finding the circumfernce 3) Adding by 1, 4) Subtracting by 1, 5) multiplying by pie, 6) quit: ");
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();
            if (option == 1) {
                System.out.print("Please write a numerator: ");
                int numerator = scan.nextInt();
                System.out.print("Please write a denominator: ");
                int denominator = scan.nextInt();
                try {
                    int trial1 = (numerator / denominator);
                    System.out.println(numerator / denominator);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            }
            if (option == 2) {
                System.out.print("Please pick a radius: ");
                int radius = scan.nextInt();
                double circumference = ((radius * 2) * pie);
                System.out.println("The radius is: " + circumference);

            }
            if (option == 3) {
                System.out.print("Please pick a number: ");
                int num = scan.nextInt();
                num++;
                System.out.print("The number is now: " + num);


            }
            if (option == 4) {
                System.out.print("Please pick a number: ");
                int num = scan.nextInt();
                num--;
                System.out.print("The number is now: " + num);


            }
            if (option == 5) {
                System.out.print("Please pick a number: ");
                double num = scan.nextInt();
                num *= pie;
                System.out.print("The number is now: " + num);


            }
            if (option == 6) {
                quit = true;

            }
        }


    }
}

