import java.util.*;
public class allStrings {
    static void strings(String s, String result){
        if(s.isEmpty()){
            System.out.println(result);
            return;
        }

        for(int i=0; i<s.length(); i++){
            String rest = s.substring(0, i) + s.substring(i+1);
            strings(rest, result+s.charAt(i));
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        strings(str, "");
    }
}