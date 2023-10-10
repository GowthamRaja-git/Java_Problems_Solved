import java.util.Scanner;

public class Searchrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = "gowtham";
        //System.out.println("Enter the character you want check in the string : ");
    
        char target = 't';


        System.out.println(Search(name, target, 2, 6));
    }

    static boolean Search(String str, char trg, int start, int end){
        if(str.length() == 0){
            return false;
        }

        for(int i = start; i <= end; i++){
            if( trg == str.charAt(i)){
                return true;
            }

            //return false;
        }

        return false;

    } 
    
      
    
}
