import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter the value of a and b: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("The sum of a nad b is : " + sum );


    }
}
