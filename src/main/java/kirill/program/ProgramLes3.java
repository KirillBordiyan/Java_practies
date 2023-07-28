package kirill.program;

import java.util.ArrayList;
import java.util.Arrays;

public class ProgramLes3 {
    public static void main(String[] args) {
        //task 1
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("1", "2", "2", "4", "3", "1", "4", "5", "2"));
//        countAndPrint(strings);
        removeDuplicates(strings);
        String words = "шалава";
        System.out.println(IsPAl(words));

    }

    //task 1 example
    private static void countAndPrint(ArrayList<String> strings) {
        // "1" -> 2
        // "2" -> 3

        ArrayList<String> unique = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) { // [0, size)
            String element = strings.get(i);
            if (unique.contains(element)) {
                continue;
            }

            int counter = 1;
            for (int j = i + 1; j < strings.size(); j++) { // [i + 1, size)
                String another = strings.get(j);
                if (element.equals(another)) {
                    counter++;
                }
            }
            System.out.println(element + " - " + counter);
            unique.add(element);
        }
    }

    private static void removeDuplicates(ArrayList<String> strings) {
        // i = 1, j = 3
        // element = "2", another = "2"
        for (int i = 0; i < strings.size(); i++) {
            String element = strings.get(i);
            for (int j = i + 1; j < strings.size(); j++) {
                String another = strings.get(j);
                if (element.equals(another)) {
                    strings.remove(j--);

                }

            }
        }
    }

    private static boolean IsPAl(String word){
        char[] chars = word.toCharArray();
        boolean isPal = true;
        for(int i = 0; i< word.length(); i++){
            if (chars[i] != chars[word.length()-1-i]) {
                isPal = false;
                break;
            }
        }
        return isPal;
    }
}
