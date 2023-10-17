import java.util.Scanner;
public class Main {
    static int areaFinder(int x, int y) {
        return x * y * 1/2;
    }

    static double areaFinder(double x, double y) {
        return x * y * 1/2;
    }
    public static void main(String[] args) {
        int correct = 0;
        int wrong = 0;
        final double pi = 3.14;
        boolean quit = false;
        String welcome = "Welcome to my CSA project! By: Elliot Sigal";
        System.out.println(welcome);
        System.out.print("What is your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.print("What is your osis? ");
        int osis = scan.nextInt();
        scan = new Scanner(System.in);
        System.out.print("What is your email? ");
        String email = scan.nextLine();
        Player player1 = new Player();
        player1.setName(name);
        player1.setOsis(osis);
        player1.setEmail(email);
        System.out.print("What is your year of birth? \nIf you do not know your year of birth enter 0  ");
        int dob = scan.nextInt();
        System.out.print("What is the current year? ");
        int currentyear = scan.nextInt();
        Student s = new Student(dob,currentyear);
        if (dob == 0) {
            Student sn = new Student();
            System.out.println("Your age is " + sn.getAverageage() + " the information you gave is an osis of " + player1.getOsis() + " and and email of " + player1.getEmail());
        } else {
            System.out.println("Your age is " + s.getAge() + " the information you gave is an osis of " + player1.getOsis() + " and and email of " + player1.getEmail());
        }
        try {
            Thread.sleep(2000); // 2000ms = 2s
        } catch (InterruptedException ex) {

        }
        System.out.println("Now let's start!");
        String difficulties = " 1) Hard 1) Hard 1) Hard 2) quit ";
        String pickdiff = "Pick a difficulty: ";
        System.out.print(pickdiff.concat(difficulties));
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
            System.out.println("Now this is the last question(!):What is 3 multiplied by 19");
            int x = 3;
            scan = new Scanner(System.in);;
            double answer4 = scan.nextDouble();
            if (answer4 == (x*=19)) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Wrong!");
                wrong++;
            }
            scan = new Scanner(System.in);
            System.out.println("What is the word that represents the default value for reference types? ");
            String answer5 = scan.nextLine();
            if (answer5.equals("Null")) {
                System.out.println("Correct! Null stores reference types and has its own exception");
                correct++;
            } else {
                System.out.println("Wrong! The correct answer was Null, this is an example of a null exception.");
                wrong++;
            }
            try {
                nullTest();
            } catch (NullPointerException e) {
                System.out.println("This is a Null exception when it is caught! ");
            }
            System.out.println("Bonus! Use the built-in calculator to find the area of a triangle with doubles and integers: Enter your integer length: ");
            int intlength = scan.nextInt();
            System.out.println("Integer width: ");
            int intwidth = scan.nextInt();
            System.out.println("Use the built-in calculator to find the area of a triangle with doubles and integers. Enter your double length: ");
            double doublelength = scan.nextDouble();
            System.out.println("Double width: ");
            double doublewidth = scan.nextDouble();
            int intarea = areaFinder(intlength, intwidth);
            double doublearea = areaFinder(doublelength, doublewidth);
            System.out.println ("Your double area is " + doublearea + " and your integer area is " + intarea);
            player1.addScore(correct);
            Grades g = new Grades(correct,wrong);
            System.out.println(g.toString() + player1.getScore());








        }

    }
    public static void nullTest() {
        String nullString = null;
        nullString.endsWith("test");
    }
}