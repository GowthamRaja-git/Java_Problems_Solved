import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Searchstr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = "gowtham";
        //System.out.println("Enter the character you want check in the string : ");
    
        char target = 's';

        System.out.println(Search(name, target));
    }

    static boolean Search(String str, char trg){
        if(str.length() == 0){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if( trg == str.charAt(i)){
                return true;
            }

            //return false;
        }

        return false;

    } 
    
      
    
}
