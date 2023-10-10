import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter th number u want to check, whether it is amstrong or not : ");
        int num = in.nextInt();
        int ans = amst(num);
        if(ans == num){
            System.out.println("Yes" + " " + ans + " " + "It is a Amstrong no. ");
        }
        else{
            System.out.println("It is not a Amstrong number.");
        }
        



    }

    static int amst(int num){                    //  153                    // 15
        int count = 0;                                                      // count = 27
        while (num > 0){                    // 153 > 0                      // 15 > 0
            int temp = num;                 // int temp = 153                // int temp = 15
            temp = num % 10;             // 153 = 153 % 10 ----> 3           // 15 = 15 % 10 -------- 5 
            int sqr = temp * temp * temp;      //  int sqr = 27;              // int sqr = 5*5*5 = 125;
            count = count + sqr; 
            num = num / 10;           //count = 0 + 27 = 27              // count = 27 + 125 = 152
        }
                                                                 // 15 = 15 / 10 -----> 

        return count;

     
    }
    
}
