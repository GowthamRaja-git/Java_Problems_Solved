import java.util.Scanner;;

public class BinaryS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 36;

        // Binary Search is used on sorted arrays...
        // time complexity log(N)... where last element remaining is 1
        // log2(N)... 2log(100)-->50-->25-->12.5 that is 12 in int ----> 6 --->3 ---> s,m,e...
        

        System.out.println(binaryser(arr, target));


    }

    static int binaryser(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){

            int mid = start + (end - start) / 2; // start + end / 2

            if (target < arr[mid]){
                end = mid - 1;
            }

            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
