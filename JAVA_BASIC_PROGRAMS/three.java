import java.util.*;
public class three {
    public static void main(String args[]){
        System.out.println("vowels checking");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean result = str.toLowerCase().matches("[aeiou]");
        System.out.println(result);
        sc.close();
        
    }    
}
