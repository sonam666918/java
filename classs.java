import java.util.HashMap;
public class classs {
    public static void main(String[] args) {
      /*   int[] arr={3,4,56,24,4,3,43}; 
        HashMap<String ,Integer> map=new HashMap<>();
        map.put("id0",1);
        map.put("id1",6);
        map.put("id2",123);
         System.out.println(map.getOrDefault("id0",1));
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.forEach((key,value) ->{
            System.out.println(key + value);
        });*/

        //  Question :-  calculate the frequency of each word 

       /*  String str="programming"; //p=1,r=2
        HashMap<Character ,Integer> map=new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,  map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
        char[] ch=str.toCharArray();
        */

        String str="programming";
        String[] newStr= str.split(" ");
        HashMap<String ,Integer> map=new HashMap<>();
        for(String ch : newStr){
            map.put(ch, map.getOrDefault(ch,0)+1);
            if(map.getOrDefault(ch,0) ==1);{
            System.out.println(map);
            break;
        }
    }

    }
    
}
