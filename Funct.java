import java.util.Scanner;

public class Funct{
    public static void main(String[] args) {
        int retval =  sum();
        System.out.println(retval);
    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers to perform addition : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a + b;
        System.out.println("The addition of the two numbers " + a +" "+ "and" + b + " are " + c);

        return c;

    }
}