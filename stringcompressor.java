public class stringcompressor {
    public static String compressoString(String input) {
        if(input ==null || input.isEmpty()){
            return input;
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char currentChar = input.charAt(0);
        for(int i =1;i<input.length();i++){
            if(input.charAt(i) == currentChar){
                count++;
            }
            else{
                compressed.append(currentChar);
                    currentChar = input.charAt(i);
                         count = 1;

            }
        }
        compressed.append(currentChar);
        compressed.append(count);
        return compressed.toString();
    }
    
}
