import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a non negative integer: ");
        int num = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
     System.out.println("factorial of" + num + " is: " + fact);
        scanner.close();
    }
    
}
