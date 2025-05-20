public class subsets {
    
    public static void sub(String str, String ans, int i){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        sub(str, ans+str.charAt(i), i+1);
        sub(str, ans, i+1);
    }
    
    public static void main(String[] args) {
        String str = "abc";
        sub(str, "", 0);
    }    
}
