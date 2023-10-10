import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Twodarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        //System.out.println(arr.length);

        // for each rows
        for(int row=0; row<arr.length; row++){
            // for each colums
            for(int col=0; col<arr[row].length; col++){
                arr[row][col]=in.nextInt();
                //System.out.println(arr[row][col]);
                //System.out.println(Arrays.toString(arr[row][col]));
            }
            

        }

         // for each rows
        for(int row=0; row<arr.length; row++){
            System.out.println();
            // for each colums
            for(int col=0; col<arr[row].length; col++){
                //arr[row][col]=in.nextInt();
                System.out.print(arr[row][col] + " ");
                //System.out.println(Arrays.toString(arr[row][col]));
            }
            

        }
        System.out.println();

        for(int row = 0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println();

        // Enhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
