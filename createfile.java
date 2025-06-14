import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class createfile {
    public static void main(String[] args) {
        try {
            File file = new File("new.txt");
            if(file.createNewFile()){
                System.out.println("file created: " + file.getName() );
            }else{
                System.out.println("file already exits: ");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
    
 }
 //import java.io.FileWriter;
// import java.io.IOException;
 class WriteToFile {
   public  static void main(String[] args){
        try {
            FileWriter Writer = new FileWriter("new.txt");
            Writer.write("hello, this is a text message written to new file. ");
            Writer.close();
            System.out.println("succesfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("an error occured. ");
            e.printStackTrace();
        }
    }
 }
 //import java.io.File;
// import java.util.Scanner;
//import java.io.FileNotFoundException;
  class ReadFromfile{
    public static void main(String[] args) {
        try{
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        }
        catch (FileNotFoundException e){
           System.out.println("an error occured. ");
           e.printStackTrace();
        }
    
        
    }
 } 
 //import java.io.File;
class Deletefile{
     public static void main(String[] args){
        File file = new File("example.txt");
        if(file.delete()){
            System.out.println("Deleted the file :" + file.getName());
        }else{
            System.out.println("Failed to delete the file");
        }
     }
 }

 /*import java util.*;
 public class ArrayInsertExample{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers you want to insert? ");
        int n = sc.nextInt();

        for(int i=0; i<)
    }
 }*/