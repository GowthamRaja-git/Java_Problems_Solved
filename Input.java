import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        System.out.print("Enter the value to want ");
        Scanner rollno = new Scanner(System.in);
        int value  = rollno.nextInt();
        System.out.println("The entered value is : " + value);
        Scanner marks = new Scanner(System.in);
        float studmark = marks.nextFloat();
        System.out.println("Your mark is : " + studmark );

    }
} 
