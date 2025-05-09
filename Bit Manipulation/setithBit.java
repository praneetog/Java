import java.util.Scanner;

public class setithBit {
    public static int check(int bit, int n){
        int res = (1<<n);
        return (bit | res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bit = 10;
        int n = 2;
        System.out.println(check(bit, n));
    }
}
