import java.util.ArrayList;
import java.util.Scanner;

public class arrayListEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        System.out.println(list.contains(4)); //true
        System.out.println(list.contains(7)); //false

        list.set(1,99); //1st index pe 2 ki jagah 99 aa jayega
        list.remove(2); //element at index number 2 will be removed
        
        
        //take input
        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }

        //get item at any index
        for (int i=0; i<5; i++){

        }

        System.out.println();
    }
}
