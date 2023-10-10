import java.util.Scanner;

public class Smallestltr {
    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        char target = 'a';

        char ans = smalllet(letters, target);

        System.out.println(ans);

    }

    static char smalllet(char[] letters, char target){

        int start = 0;
        int end = letters.length;
        end = end - 1;

        while (start <= end){
            int mid = start + (start - end) / 2;

            if(target > letters[mid]){
                end = mid  - 1;
            }
            else if (target < letters[mid]){
                start = mid + 1;
            }
            else {
                return letters[mid];
            }
        }
        return letters[start];
    }
    
}
