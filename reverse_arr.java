import java.util.*;
public class reverse_arr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // reverse(str);
        System.out.println("Reversed String : "+reverse(str));
        sc.close();
    }   
    public static String reverse(String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
           rev = rev+str.charAt(i);
        }
        return rev;
    } 
}
