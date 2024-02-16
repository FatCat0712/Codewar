import java.util.HashMap;
import java.util.Map;

public class count_characters_in_string {
    public static Map<Character, Integer> count(String str) {
        Map<Character,Integer> map = new HashMap<>();
       if(str.isEmpty()){
           return new HashMap<>(){};
       }
       else{
           char[] characters = str.toCharArray();
           for (char character : characters) {
               if(map.containsKey(character)){
                   int oldValue = map.get(character);
                   map.replace(character,oldValue + 1);
               }
               else{
                   map.put(character, 1);
               }
           }
       }
       return map;

    }

    public static void main(String[] args) {
        String str = "aaaaa";
        Map<Character,Integer> map = count(str);
        for(Character key : map.keySet()){
            int vl = map.get(key);
            System.out.println(key+" : "+ vl);
        }
    }
}
