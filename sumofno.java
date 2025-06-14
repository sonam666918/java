import java.util.*;
public class sumofno { 
   /* public static void main(String[] args) {
      int  n=5;
      int sum=0;
      for(int i=1;i<=n;i++){
        sum=sum+i;
        System.out.println(sum);
      }

    }*/
    // print table of a number input by user
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       int mul;
        for(int i=1;i<=10;i++){ 
          mul= n*i;
            System.out.println(mul);

        }
        
    }
    
}
