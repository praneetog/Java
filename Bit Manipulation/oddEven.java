import java.util.*;
public class oddEven {

    public static void check(int n){
        if((1 & n) == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
}