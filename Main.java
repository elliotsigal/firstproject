import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int correct = 0;
        int wrong = 0;
        final double pi = 3.14;
        System.out.println("Welcome to the brand new CST");
        try {
            Thread.sleep(1000); // 2000ms = 2s
        } catch (InterruptedException ex) {

        }
        System.out.println("Let's start");
        System.out.println("Pick a difficulty: 1) Hard 2) Medium 3) Easy: ");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        if (option == 1) {
            System.out.println("Wow, let's see how smart you really are!");
            System.out.println("What is the power of 2 that will get you " + (Integer.MAX_VALUE+1) + " when added by 1");
            int answer1 = scan.nextInt();
            if (answer1 !=31) {
                wrong++;

                        } else {
                            System.out.println("Correct");
                            correct++;

                        }
                        System.out.println("Next question: What number does the denominator have to be for a Arthimetic exception to occur?");
                        int answer2 = scan.nextInt();
                        System.out.println("pick a numerator to see if you are correct");
                        int numerator = scan.nextInt();
                        try {
                                int trial1 = numerator / answer2;
                                System.out.println((double)trial1);
                                System.out.println("Wrong!");
                                wrong++;
                        } catch (ArithmeticException e) {
                            System.out.println("Correct!");
                            correct++;

                        }
                        System.out.println("last question(!):What is the area of a circle with a diameter of 10?");
                        double answer3 = scan.nextDouble();
                        if (answer3 == Math.pow((10/2),2)*pi) {
                            System.out.println("Correct!");
                            correct++;
                        } else {
                            System.out.println("Wrong!");
                            wrong++;
                        }





                    }

                }
            }




