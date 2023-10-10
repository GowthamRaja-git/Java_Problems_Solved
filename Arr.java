import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // int[] arr = new int[5];
        // System.out.println("Enter the 5 numbers : ");

        // for(int i=0; i<arr.length; i++){
            
        //     arr[i] =  in.nextInt();
        //     System.out.print(arr[i] + " ");


        // }

        String[] str = new String[4];
        
        for (int i = 0; i < str.length; i++){
            str[i] = in.next();
            //System.out.println(str[i]+ " ");

        }
        for (int j = 0; j < str.length; j++){
        System.out.println(str[j]+ " ");
        }

        
    }
    
}
