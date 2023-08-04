package kirill.helper;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelperLes5 {
    //дан список строк, определить встречаемость каждого элемента

    public void countAndPrint(List<String> values){
        Map<String, Integer> stats = new HashMap<>();
        for(String key: values){
            if(stats.containsKey(key)){
                Integer oldVal = stats.get(key);
                stats.put(key, oldVal + 1);
            }else{
                stats.put(key, 1);
            }
        }
        System.out.println(stats);
    }

    public boolean isIsomorphic(String first, String second) {
        // int -> Integer, char -> Character, long -> Long
        Map<Character, Character> mapping = new HashMap<>();

        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        if (firstChars.length != secondChars.length) {
            return false;
        }


        for (int i = 0; i < firstChars.length; i++) {
            char firstChar = firstChars[i];   // o
            char secondChar = secondChars[i]; // r

            if (mapping.containsKey(firstChar)) {
                Character prevChar = mapping.get(firstChar); // a
                if (prevChar != secondChar) {
                    return false;
                }
            } else {
                mapping.put(firstChar, secondChar);
            }
        }
        return true;
    }

}
