package myapp;
    class parent{
        void sum(int a){
            System.out.println("me hu chor"+ "  "+a);
        }
        void sum(int a,int b){
            System.out.println(a+b);
        }
        void sum(int a,int b,int c){
            System.out.println(a+b+c);
        }
    }

 public class methodoverloading{
    public static void main(String[] args) {
        parent obj = new parent();
        obj.sum(420);
        obj.sum(420,40);
        obj.sum(420,40,60);
        
        
    }
 }
