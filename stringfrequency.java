 import java.util.Arrays;

 public class stringfrequency {
  /*  public static void main(String[] args) {
       String str = "hello";
       // String str2 = "ollhe";
        Map<Character,Integer>frequencyMap = new HashMap<>();

        for(char c : str.toCharArray()){
            if(frequencyMap.containsKey(c)){
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            }else{
                frequencyMap.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer>entry:frequencyMap.entrySet()){
            System.out.println("Character:" + entry.getKey() + "frequency:" + entry.getValue());
        }

    }
    
}*/
public static void main(String[] args) {
    

String str1 = "hello";
String str2 = "ollhe";
if(isAnagram(str1 , str2)){
    System.out.println(str1 + "aur" + str2 + "anagram hain");
}else{
    System.out.println(str1 + "aur" + str2 + "anagram nhi hai");

    public static boolean isAnagram(String str1 , String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
         Arrays.sort(charArray2);


         return Arrays.equals(charArray1,charArray2);
    } 
}
 
}
 }