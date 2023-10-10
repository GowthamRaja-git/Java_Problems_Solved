import java.util.Arrays;
import java.util.Scanner;

public class Rever {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = { 5, 2, 3, 4, 1};

        System.out.println(Arrays.toString(arr));

        Rev(arr);
        System.out.println(Arrays.toString(arr));




    }

    static void Rev(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while ( start < end ){
            swap(arr, start, end);
            start++;
            end--;
        }
        
    }
    
    static void swap(int arr[], int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    
}
