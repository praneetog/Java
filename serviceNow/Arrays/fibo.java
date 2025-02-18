import java.util.*;
class fibo{

    // static void nNatural(int n){
    //     if(n<1){
    //         return;
    //     }
    //     nNatural(n-1);
    //     System.out.print(n+" ");
    // }

    static int nFibo(int n){
        if(n==0){
            return 0;
        } 
        if(n==1){
            return 1;
        }
        return nFibo(n-1) + nFibo(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // nNatural(n);
        for(int i=0; i<n; i++){
            System.out.print(nFibo(i)+" ");
        }    
    }
}