import java.util.Scanner;

public class str_arr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = null;
        arr = str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
