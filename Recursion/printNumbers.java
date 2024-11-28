class printNumbers{

    public static void main(String[] args){
        printNumbers(10);
    }

    static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
}