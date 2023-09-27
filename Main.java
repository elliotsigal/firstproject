import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int correct = 0;
        int wrong = 0;
        final double pi = 3.14;
        boolean quit = false;
        System.out.println("Welcome to the brand new CST");
        System.out.print("What is your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.print("What is your osis? ");
        int osis = scan.nextInt();
        scan = new Scanner(System.in);
        System.out.print("What is your email? ");
        String email = scan.nextLine();
       // System.out.print("What is the current year? ");
        //double height = scan.nextDouble();
        Player player1 = new Player();
        player1.setName(name);
        player1.setOsis(osis);
        player1.setEmail(email);
        System.out.print("What is your yob? If you do not know your yob enter 0  ");
        int dob = scan.nextInt();
        System.out.print("What is the current year? ");
        int currentyear = scan.nextInt();
        Student s = new Student(dob,currentyear);
        if (dob == 0) {
            System.out.println("Hello " + player1.getName() + " age of " + s.getAverageage() + " the information you gave is an osis of " + player1.getOsis() + " and and email of " + player1.getEmail());
        } else {
            System.out.println("Hello " + player1.getName() + " age of " + s.getAge() + " the information you gave is an osis of " + player1.getOsis() + " and and email of " + player1.getEmail());
        }
        try {
            Thread.sleep(2000); // 2000ms = 2s
        } catch (InterruptedException ex) {

        }
        System.out.println("Now let's start!");
        System.out.print("Pick a difficulty: 1) Hard 1) Hard 1) Hard(Always test your limits!): ");
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
            double answer4 = scan.nextDouble();
            if (answer4 == (x*=19)) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Wrong!");
                wrong++;
            }
            player1.addScore(correct);
            System.out.println("That wasn't so bad! You got " + correct + " correct and " + wrong + " wrong for a score of " + player1.getScore());







        }

    }
}