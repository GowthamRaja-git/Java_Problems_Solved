import java.util.Scanner;

public class Minimumnolin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {23, 60, 17, 24, 5, -7, 4};

        // System.out.println("enter the target to search : ");
        // int target = in.nextInt();

        int min = searchmin(arr);
        
    }

    static int searchmin(int[] arr){
        for(int i=1; i<arr.length; i++){
            int min = arr[0];
            if(min<arr[i]){
                return 
            }
        }

    }


    
}
