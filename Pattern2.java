import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;

        for (int i = 0; i < n ; i++ ){
            for(int j = 5; j > i; j--){
                System.out.print("*"+" ");
                
                
            }
            
            System.out.println();
        }
    }
    
}

