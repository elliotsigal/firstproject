import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final int count = 5;
        double count1 = 5;
        count1 = count1 + 5;
        boolean question = false;
        double finalnum = ((count+5)*count1);
        double compoundexpression = ((2+5)%2);
        System.out.println("Hello and welcome! ");
        System.out.println(count);
        System.out.println(count1);
        System.out.println(question);
        System.out.println(finalnum);
        System.out.println(compoundexpression);
        try{
            int divide = (5/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero!");
        }
        int x = 2;
        x++;
        int y = 6;
        y--;
        System.out.print("Please write a number: ");
        Scanner scan = new Scanner(System.in);
        int numberone = scan.nextInt();
        System.out.println(numberone*=x);
        System.out.print("Please write a second number: ");
        int numbertwo = scan.nextInt();
        System.out.println(numbertwo-=y);
        System.out.print("Please write a numerator: ");
        int numerator = scan.nextInt();
        System.out.print("Please write a denominator: ");
        int denominator = scan.nextInt();
        try{
            int trial1 = (numerator/denominator);
            System.out.println(numerator/denominator);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero!");
        }
        //System.out.println(numerator/denominator);
        scan.close();





    }
}