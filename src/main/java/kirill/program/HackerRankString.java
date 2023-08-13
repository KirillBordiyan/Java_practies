package kirill.program;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRankString {
    public static void main(String[] args) {
        String s = "crackerhackerknar";
        String result = Result2.hackerrankInString(s);
        System.out.println(result);
    }
}


class Result2 {
    public static String hackerrankInString(String s) {
        // Write your code here
        String ans = "";

        char[] charArr = s.toCharArray();
        List<Character> find = Arrays.asList('h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k');
        List<Character> result = new ArrayList<>();
        int newid = 0;
        for (Character character : find) {
            int input = 1;
            for (int charArrInd = newid; charArrInd < charArr.length; charArrInd++) {

                if (charArr[charArrInd] == character && input == 1) {
                    input = 0;
                    result.add(character);
                    newid = charArrInd+1;

                    if(charArrInd != charArr.length-1) {
                        while ((charArr[charArrInd] == charArr[charArrInd + 1])) {
                            newid = charArrInd++;
                        }
                    }
                }
            }
        }

        System.out.println(find);
        System.out.println(result);
        if(result.equals(find)){
            ans ="YES";
        }else{
            ans = "NO";
        }

        return ans;
    }

}