import java.util.*;
public class com{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        String a = sc.next();
        char t[]= a.toCharArray();
        for(char b:t){
            System.out.print(b+" ");
        }
        System.out.println("");
        int len=a.length();
        int n=0;
        
           for(int i=0;i<t.length;i++){
                if(t[i]==t[0]){
                System.out.print(t[i]);
                // n++;
            }
            else{
                System.out.print(t[i]+" ");
            }
            n++;
        
        }
    
        System.out.println("");
        for(int i=0;i<t.length;i++){
            if(t[i]==t[1]){
                System.out.print(t[i]);
                n++;
            }
            else{
                System.out.print(t[i]+" ");
            }
        
        }
        System.out.println("");
        System.out.println(a);
        sc.close();
        
    }
}