interface Client{
    void show();
}
  interface Client2{
    void show();
  }
 
 class Dev implements Client, Client2{
    public void show(){
        System.out.println("this is common feature for client && client2");
    }
    
}
     public class multipleusinginterface{
      public static void main(String[] args) {
        Dev obj=new Dev();
        obj.show();
      }
     }