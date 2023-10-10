import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose any one of the option below : ");
        System.out.println("1 to Add");
        System.out.println("2 to Sub");
        System.out.println("3 to Mult");
        System.out.println("4 to Divd");
        System.out.println("5 to Modu");
        int choice = in.nextInt();
        System.out.println("Enter two operands to perform operation : ");
        int a = in.nextInt();
        int b = in.nextInt();

        if(choice == 1){
                System.out.println(a+b);
        }
        else if(choice == 2){
            System.out.println(a-b);
        }
        else if (choice==3){
            System.out.println(a*b);
        }
        else if (choice == 4){
            System.out.println(a/b);
        }
        else{
            System.out.println(a%b);
        }



    }
    
}
