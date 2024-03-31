import java.util.*;
public class one{
    public static void main(String args[]){
        System.out.println("Resverse a string");
        System.out.println("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        String in = sc.next();
        char i[] = in.toCharArray();
        for(int j=i.length-1;j>0;j--){
            out.append(i[j]);
        }
        String result = out.toString();
        System.out.println("Reversed string : "+result);
        sc.close();
    }
    
}