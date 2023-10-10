import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = input.nextInt();
        System.out.println("Enter the value of b :");
        int b = input.nextInt();
        System.out.println("Enter the value of c :");
        int c = input.nextInt();

        // if(a>b && a>c){
        //     System.out.println(a + " is greater ");
        // }
        // else if(b>a && b>c){
        //     System.out.println(b + " is greater");
        // }
        // else
        // {
        //     System.out.println(c + " is greater");
        // }


        // int max = a;
        // if(b>max){
        //     max = b;
        // }
        // if(c>max){
        //     max = c;
        // }

        // System.out.println("The greastest number is : " + max);


        int max = a;
        max = Math.max(a, b);
        max = Math.max(b, c);
        System.out.println("The greatest value is : " + max);
    }
}
