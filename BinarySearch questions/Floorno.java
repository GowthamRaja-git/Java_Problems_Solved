//  Q2 : Floor of a NUmber

/*
 *  Floor No = greatest element in array smaller or = to target.
 * 
 * 
 * 
 */ 
import java.util.Scanner;

public class Floorno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {2, 3, 5, 9, 14, 16, 18};

        int target = 4;

        int ans = floorno(arr, target);

        System.out.println(ans);
    }

    static int floorno(int[] arr, int target){

        int start = 0;   // 0 
        int end = arr.length - 1;  // 6
        
        while(start <= end){   // 0 <= 6

            int mid = start + (end - start) / 2;
            // mid  = 0 + (6-0) / 2 ---> 6/2 ---> 3 [mid=3]

            
            if (target < arr[mid]){ // 15 < arr[3] --> 14 < 9
                end = mid - 1; 
            }

            else if (target > arr[mid]){ // 14 > 9 
                start = mid + 1;   // start = 3+1 = 4
            }
            
             else{
                return mid;
             }
        }
        return end;
    }
    
}
