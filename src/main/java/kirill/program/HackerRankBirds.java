package kirill.program;

import java.util.*;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.joining;


public class HackerRankBirds {
    public static void main(String[] args) {

            List<Integer> arr = Arrays.asList(1 ,2 ,4 ,5 ,3 ,3 ,4 ,5 ,1 ,4 ,5 ,2, 4, 1, 2, 3, 5, 5);
                int result = Result.migratoryBirds(arr);
                System.out.println(result);



    }
}


class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int maxFirstType = 0;//keys
        int maxval = 0;
        if(arr.size() >= 5){
            Map<Integer,Integer> mapping = new TreeMap<>();

            for(int i = 0; i<arr.size(); i++){
                int key = arr.get(i); //из arr -> 1

                if(!mapping.containsKey(key)) {
                    mapping.put(key, 1);
                }else{
                    int prevInt = mapping.get(key);
                    mapping.put(key, prevInt+1);
                }
            }

            System.out.println(mapping);

            for(int key: mapping.keySet()){
                if(maxval < mapping.get(key)){
                    maxval = mapping.get(key);
                    maxFirstType = key;
                }
            }

        }
        return maxFirstType;
    }

}