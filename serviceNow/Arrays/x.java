package serviceNow.Arrays;
import java.util.*;

public class x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n-1; 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j || j==a){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            a--;
            System.out.println();
        }
    }
}
