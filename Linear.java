import java.util.Arrays;
import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 05 Elements : ");

        for (int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter an target element to search in array : ");

        int target = in.nextInt();

        tar(arr, target);

        System.out.println(Arrays.toString(arr));

    }

    static void tar(int[] arr , int num){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == num){
                System.out.println("Target found :  " + arr[i]);
            }
            // else{
            //     System.out.println("No such target found ");
            // }

        }

    }
    
}
