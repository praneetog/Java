package serviceNow.Arrays;
import java.util.*;

public class complex3rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=n; k>=i; k--){
                for(int j=1; j<=i*2-1; j++){                
                    System.out.print("* ");
                }
                System.out.println();                
            }
        }
    }
}
