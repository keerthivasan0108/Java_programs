import java.util.Scanner;
import java.lang.Math;
public class deserian {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int temp = n,digit=0;
        int last=0,sum=0;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        temp = n;
        int c = digit;
        for(int i=1;i<=c;i++){
            last = temp%10;
            sum=sum+(int)(Math.pow(last,digit));
            temp=temp/10;
            digit--;
        }
        if(n==sum){
            System.out.println("Yes");
        }
        // else{
        //     System.out.println("No");
        // }
        sc.close();
    }
}
