
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




    }
}