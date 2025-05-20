
    class Student{
    String firstName="rahul";
    int age=11;

    Student(String firstName,int age){
        this.firstName=firstName;
        age=age;

       // System.out.println(firstName+ " " +age);
    }
   // void name(){
     //   System.out.println(firstName+ " " +age);
 //   }
}

public class constructorthis{ 
public static void main(String args[]){ 
Student obj= new Student("rahul",11);
Student obj1= new Student("ravi",15);

System.out.println(obj.firstName);
System.out.println(obj1.firstName);
}
}
    
