import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to The Calculator");
        boolean quit = false;
        final double pie = 3.14;
        while (quit == false) {
            System.out.println("");
            System.out.println("Remember pie is " + pie + "!");
            System.out.println("");
            System.out.print("Please pick an option: 1) Division, 2) Finding the circumfernce 3) Adding by 1, 4) Subtracting by 1, 5) multiplying by pie, 6)Break the system 7) quit: ");
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();
            if (option == 1) {
                System.out.print("Please write a numerator: ");
                int numerator = scan.nextInt();
                if (scan.hasNextInt()) {
                    System.out.print("Always write your numbers in doubles!");
                }
                System.out.print("Please write a denominator: ");
                if (scan.hasNextInt()) {
                    System.out.print("Always write your numbers in doubles!");
                }
                int denominator = scan.nextInt();
                try {
                    double trial1 = (double) numerator / denominator;
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
                int value = Integer.MAX_VALUE-1;
                int i = 0;
                while (true) {
                    if (i == 50) {
                        break;
                    }
                    System.out.println(value);
                    i++;
                    value++;

                }
                System.out.println("");
                System.out.println("Oh no! You have broken the calculator!");
                try {
                    Thread.sleep(5000); // 2000ms = 2s
                } catch (InterruptedException ex) {
                    // Handle the exception
                }
                System.out.println("");
                System.out.println("");
                System.out.println("Nevermind, continue with the program.");

                }
            if (option == 7) {
                quit = true;

            }

                }
            }
        }




