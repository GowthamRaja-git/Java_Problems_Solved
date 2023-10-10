import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fibonacci number : ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n ){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);






        // n = n-1 + n-2;
        // int a = n-1;
        // int b = n-2;
        // System.out.println("The Fibonacci Series of " + n + " is " + b + " "+ a + " "+ n);

    }
    
}
