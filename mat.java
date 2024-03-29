import java.util.*;
public class mat{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int v = sc.nextInt();
        int arr[][] = new int[b][v];
        int arr1[][] = new int[b][v];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                arr1[i][j] = arr[i][j];
            }
            System.out.print(arr1);
        }
        
    }
}