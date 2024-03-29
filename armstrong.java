import java.util.*;
import java.lang.Math;
class arm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int a = sc.nextInt();
        int temp=a;//153
        int digit=0,last=0,sum=0;
        while(temp>0){
            temp = temp/10;//3 5 1
            //System.out.println(temp);
            digit++;//3
            
        }
        //System.out.println(digit);
        temp=a;
        for(int i=1;i<=digit;i++)//153
        {
            // System.out.print(temp);
            last=temp%10;//3
            sum =sum+(int)(Math.pow(last,digit));//27 

            temp=temp/10;//
            // System.out.println(last);

        }
        if(a==sum){
            System.out.println("yes");
        }
        // 153
        sc.close();
    }
}
