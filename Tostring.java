import java.util.Arrays;
import java.util.Scanner;

public class Tostring{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives....
        int[] arr = new int[5];

        for (int i=0; i<5; i++){
            arr[i] = in.nextInt();
        }

        for(int num : arr){                // enhanced for loop or for each loop , internally it uses for loop
            System.out.println(num + " ");
        }

        System.out.println(Arrays.toString(arr));     // to string method in arrays class....


        // array of objects...

        String[] str = new String[4];

        for(int i=0; i<str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
    } 


    // stack and heap memory happens here....

    // mutuable ---> can change values of objects...   arrays are example
    // immutuable ----> cannot change objects value... strings are example
}