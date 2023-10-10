import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(20);
        list.add(30);
        list.add(44);

        System.out.println(list);                         // prints all those numbers in a list...
        System.out.println(list.contains(30));     //    ------------->  prints true
        list.set(0,23);     //  changes index[0]----> to 23
        System.out.println(list);



        for(int i=0; i<10; i++ ){
            list.add(in.nextInt());
        }

        for(int i = 0; i < 10; i++){
            System.out.println(list.get(i));
        }
    }
    
}
