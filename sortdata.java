/* import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>{
        int age;
        String name;


    public Student(int age, int name){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return age +" "+ name;
    } 
    public int compareTo(Student s){
        return age compareTo(s);

    }

}
public class sortdata { 
    public static void main(String[] args) {
        Arraylist<Student> list=new ArrayList<>();
        list.add (new Student(16,"ravi"));
         list.add (new Student(11,"rohit"));
          list.add (new Student(54,"mohit"));
           list.add (new Student(18,"rahul"));

           Collections.sort(list);
           for(Student s: list){
              System.out.println(s.toString());
           }

    }
}*/

 import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Student.sortByAge;


class Student{
    int age;
    String name;
    int rollNo;

    public Student(int age, String name, int rollNo){
        this.age=age;
        this.name=name;
        this.rollNo=rollNo;

    }

    public String toString(){
        return age + " " + name + " " + rollNo;
        
    }
    class sortByName implements Comparator<Student>{
        public int compare(Student s1,Student s2){
            return s1.name.compareTo(s2.name);
        }
    }

    class sortByAge implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            return s1.age-s2.age;
        }
    }

}



public class sortdata { 
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add (new Student(16,"ravi",45));
         list.add (new Student(11,"rohit",56));
          list.add (new Student(54,"mohit",11));
           list.add (new Student(18,"rahul",34));
           Collections.sort(list,new sortByName());
           for(Student s: list){
            System.out.println( "name" + s);
        
           }
           Collections.sort(list , new sortByAge());
           for(Student s2: list){
            System.out.println("age" +s2);
           }


        }
    }

