import java.util.Scanner;

public class Maxarr{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements to find the max value in it : ");

        for (int i=0; i<5; i++){
            arr[i] = in.nextInt();
            System.out.println(arr[i]);
            comp(arr[i]);

        }
        
    }
    public static void comp(int a , int b , int c, int d, int e){
        if(a>b && a>c && a>d && a>e){
            System.out.println("A is the greatest");


        }
        else if(b>a && b>c && b>d && b>e){
            System.out.println("B is the  greatest");
        }
        else if(c>a && c>b && c>d && c>e){
            System.out.println("C is the greatest");
        }
        else if (d>a && d>b && d>c && d>e){
            System.out.println("D id the greatest");
        }
        else{
            System.out.println("E is the greatest");
        }

    }
}