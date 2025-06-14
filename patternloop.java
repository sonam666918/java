public class patternloop { 
    public static void main(String[] args) {
       /*  for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }*/
        int rows = 5;
        for(int i=1;i<=rows;i++){
            for(int j=i;j<=i;j++){
               System.out.println("*");
            }
        System.out.println( );
    }
    
}
}
