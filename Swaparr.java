import java.util.Arrays;
import java.util.Scanner;

public class Swaparr {
    public static void main(String[] args) {
        // int[] arr = { 1, 0, 2, 3, 4 };

        // swap(arr, 1, 0);

        // System.out.println(Arrays.toString(arr));


        Scanner in =new Scanner(System.in);

        int[] arr = new int[2];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Before Swapping : " + Arrays.toString(arr));

        swap(arr, 0, 1);

        System.out.println("After Swapping : " + Arrays.toString(arr));

   


    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
