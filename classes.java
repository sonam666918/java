class Student{
    String name="name";
    void sum(int a,int b){
        System.out.print(a+b);
    }
 }
   class FullName{
    String firstname="sonam";
    String lastname="yadav";
    void name(){
        System.out.println(firstname+" "+lastname);
    }
   }

   class Area{
    void Area(int l, int b){
        System.out.println(l*b);
    }
   }
public class classes{
    public static void main(String[] args) {
        Student obj=new Student();
        Student obj1=new Student();
        obj.sum(5,5);
        Fullname in=new Fullname();
        Area ar= new Area();
        ar.areaRec(5,6);
    }   
    
}
 