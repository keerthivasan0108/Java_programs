import java.util.*;
public class two{
    public static void main(String args[]){
        System.out.println("Swap two values without third variable");
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.print("a value ; "+a+"b value : "+b);
        sc.close();
    }
}