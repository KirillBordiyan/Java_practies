package kirill.program;

import java.util.*;

public class ProgramLes6 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,2,2,2,3,3,3,1,1,1,5,6,5,5);
        //через 2 сета
        Set<Integer> unique = new HashSet<>();
        Set<Integer> visib = new HashSet<>();

        for(Integer item: arr){
            if(visib.add(item)){
                unique.add(item);
            }else{
                unique.remove(item);
            }
        }
        int result = unique.size();
        System.out.println(result);

    }
}
