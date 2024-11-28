public class digitSum {
    public static void main(String[] args) {
        System.out.println(Sum(12345));
    }

    static int Sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + Sum(n / 10);
    }
}
