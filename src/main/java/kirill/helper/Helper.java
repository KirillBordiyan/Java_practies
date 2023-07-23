package kirill.helper;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Helper {
    public static int task1(int[] array){
        int countMax = 0;
        int count = 0;
        for(int i = 0; i<array.length; i++){
            if( array[i] == 1) count++;
            else count = 0;
            if(countMax < count) countMax = count;
        }
        return countMax;
    }


    public static void PrintArray(int[] array){
        for (int item: array) {
            System.out.println(item);
        }
    }


    public static int[] task2(int[] array, int value){
        int left = 0;
        int right = array.length-1;
        while(left < right){
            if (array[left] != value) left++;
            else if (array[right] == value) right--;
            else if (array[left] == 3 && array[right] != 3){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        PrintArray(array);
        return array;
    }


    public static String task4(List<String> strs){
        if(strs.size() == 0) {
            throw new RuntimeException("Illegal input");
        }
        if(strs.size() == 1) {
            return strs.get(0);
        }
        String answer = "";
        char currentChar;
        for(int i = 0; i < strs.get(0).length(); i++) {
            currentChar = strs.get(0).charAt(i);
            boolean isAtPrefix = true;
            for(int j = 1; j < strs.size(); j++) {
                if(strs.get(j).charAt(i) != currentChar) {
                    isAtPrefix = false;
                }
            }
            if(isAtPrefix){
                answer += currentChar;
            } else {
                return answer;
            }
        }
        return answer;
    }

    public static String task5(String sentence) {
        List<String> list = Arrays.asList(sentence.split(" "));
        Collections.reverse(list);
        String[] arr = sentence.split(" ");
        List<String> list2 = List.of(arr[0], arr[1],arr[3]);
        return String.join(" ", list);
    }

    public static int task6(int a, int b){
        int result = 1;
        for(int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }

    public static int task6_2(int number, int number_pow) {
        if(number_pow == 1) {
            return number;
        }

        return number * task6_2(number, --number_pow);

    }
}
