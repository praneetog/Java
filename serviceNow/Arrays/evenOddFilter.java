package serviceNow.Arrays;
import java.util.*;

public class evenOddFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        for(int i=0; i<n; i++){
            if(num%2==0){
                if(arr[i]%2==0){
                    System.out.println(arr[i]);
                } else {
                    continue;
                }
            } else {
                if(arr[i]%2!=0){
                    System.out.println(arr[i]);
                } else {
                    continue;
                }
            }
        }

    }
}