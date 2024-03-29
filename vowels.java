import java.util.*;
public class vowels{

    public static void main(String args[]){
        char vow[] = {'a','e','i','o','u'};
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String p = n.toLowerCase();
        char s[] = p.toCharArray();
        char a[] = new char[s.length];
        for(int i=0;i<s.length;i++){
            for(int j=0;j<vow.length;j++){
               if(s[i]==vow[j]){
                    break;
                  }
                 else{
                    //System.out.print(s[i]);
                    a[i] = s[i];
                }
        }
        System.out.print(a);
    }
    sc.close();
    }
}