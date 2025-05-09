import java.util.Scanner;
public class ithBit {
    public static void check(int bit, int n){
        int res = (1<<n);
        if((bit & res) == 0){
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bit = 10;
        int n = 2;
        check(bit, n);
    }
}
