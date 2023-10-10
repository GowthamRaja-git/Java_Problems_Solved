import java.util.Scanner;

public class Revarr{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        int act = arr.length;
        System.out.println("Enter the 5 numbers : ");

        for(int i=0; i<arr.length; i++){
            
            arr[i] =  in.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("This is the reversed array");

        for(int j=act-1; j>=0; j--){
            System.out.print(arr[j] + " ");

        }

    }

}
