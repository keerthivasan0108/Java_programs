import java.util.*;
public class sort{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int temp,j=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i!=j){ 
                    System.out.print(j);
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            
        }
        for(int p:arr){
            System.out.print(p+" ");
        }
        sc.close();
    }
}
