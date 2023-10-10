import java.util.Scanner;

public class Revno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to reverse : ");          //23597 ------> 79532
        int n = in.nextInt();

        while( n > 0 ){
            int rem = n % 10;
            System.out.print(rem);
            n = n / 10;

        }
    }
    
}
