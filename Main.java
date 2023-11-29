
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    static int areaFinder(int x, int y) {
        return x * y * 1/2;
    }

    static double areaFinder(double x, double y) {
        return x * y * 1/2;
    }
    public static void main(String[] args) throws IOException {
        //Assessment a = new Assessment("What is your name?", "Mr. Holmer");
        //a.administer();

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
        if (quit) {
            System.exit(0);
        }
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
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
        }
        try {
            Thread.sleep(1050);
        } catch (InterruptedException ex) {

        }
        System.out.println("Clearing successful...");
        System.out.println("Now let's start!");
        String difficulties = " 1) Hard 1) Hard 1) Hard 2) quit ";
        String pickdiff = "Pick a difficulty: ";
        System.out.print(pickdiff.concat(difficulties));
        int option = scan.nextInt();
        if (option == 1) {
            System.out.println("Wow, let's see how smart you really are!");
            System.out.println("What is the power of 2 that will get you " + (Integer.MAX_VALUE+1) + " when added by 1");
            int answer1 = scan.nextInt();
            System.out.println("Answer inputted... would you like to ask a friend before revealing the answer? If yes type 1, if no types 2");
            int friend = scan.nextInt();
            if (friend == 1) {
                scan = new Scanner(System.in);
                Player player2 = new Player();
                System.out.println("What is your name? ");
                String name2 = scan.nextLine();
                System.out.println("What is your osis? ");
                int osis2 = scan.nextInt();
                scan = new Scanner(System.in);
                System.out.println("What is your email? ");
                String email2 = scan.nextLine();
                player2.setName(name2);
                player2.setOsis(osis2);
                player2.setEmail(email2);
                System.out.println("The information you gave is an osis of " + player2.getOsis() + " and and email of " + player2.getEmail());
                if (player1.equals(player2)){
                    System.out.print("You are the same person! I said find a friend, your answer was ..");
                    if (answer1 == 31) {
                        System.out.println("Your answer was Correct");
                        correct++;

                    } else {
                        System.out.println("Your answer was Wrong");
                        wrong++;

                    }
                } else {
                    System.out.print("Good you found a friend, what is their answer?");
                    int answernew = scan.nextInt();
                    if (answer1 == 31 || answernew == 31) {
                        System.out.println("Correct");
                        correct++;

                    } else {
                        System.out.println("Wrong");
                        wrong++;

                    }

                }

            } else {
                if (answer1 == 31) {
                    System.out.println("Your answer was correct");
                    correct++;

                } else {
                    System.out.println("Your answer was Wrong");
                    wrong++;

                }
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
            scan = new Scanner(System.in);
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
            if (answer5.equals("Null") || answer5.equals("null")) {
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
            System.out.println(" ");
            try {
                File newfile = new File("customquestion");
                Scanner myReader = new Scanner(newfile);
                while (myReader.hasNextLine()) {
                    String question = myReader.nextLine();
                    System.out.println("Another bonus! " + question);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            double useranswer = scan.nextDouble();

            try {
                File newanswerfile = new File("customanswer");
                Scanner myReader1 = new Scanner(newanswerfile);
                if (myReader1.hasNextLine()) {
                    double answer = myReader1.nextDouble();
                    if (useranswer == answer) {
                        System.out.println("You are correct");
                    } else {
                        System.out.println("You are wrong");
                    }
                }
                myReader1.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            player1.addScore(correct);
            Grades g = new Grades(correct,wrong);
            System.out.println(g.toString() + player1.getScore());
            System.out.println("Now do you want to add one of your own questions? 1) Yes 2) No! Get me out of here 3) Maybe next time");
            int backoutoption = scan.nextInt();
            if (backoutoption != 1) {
                quit = true;

            } else {
                scan = new Scanner(System.in);
                System.out.println("Enter your question: ");
                String customquestion = scan.nextLine();
                System.out.println("Enter the correct answer: ");
                String customanswer = scan.nextLine();
                try {
                    FileWriter file = new FileWriter("customquestion");
                    file.write(customquestion);
                    file.close();
                }
                catch (IOException e) {
                    System.out.println(
                            "There are some IOException");
                }
                try {
                    FileWriter file = new FileWriter("customanswer");
                    file.write(customanswer);
                    file.close();
                }
                catch (IOException e) {
                    System.out.println(
                            "There are some IOException");
                }
            }








        } else if (option != 1){
            quit = true;
        } else {
            System.out.print("This is not one of the choices, don't try to get out of this test! Retry.");
        }

    }
    public static void nullTest() {
        String nullString = null;
        nullString.endsWith("test");
    }
}
