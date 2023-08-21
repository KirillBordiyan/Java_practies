package kirill.java_lecture.lec6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramLec6 {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(1,2,3,4,5,6,7,8,8,8,8));
        set.addAll(set2);
        System.out.println(set);
        Set<Integer> set3 = new TreeSet<>();
        for (Integer item: set2) {
            set3.add(item*item);
        }

        System.out.println(set3);
    }
}


