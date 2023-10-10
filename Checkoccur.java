import java.util.Scanner;

public class Checkoccur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to check the occurance from 132439 : ");
        int input = in.nextInt();
        int n = 132439;

        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == input){
                   count++;
                }
                n = n / 10;
            
        }

        System.out.println(count);


    }
    
}
