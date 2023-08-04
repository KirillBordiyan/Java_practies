package kirill.program;
import kirill.helper.HelperLes5;

import java.util.ArrayList;
import java.util.List;

public class ProgramLes5 {
    public static void main(String[] args) {

//        "1", "2", "2", "4", "3", "1", "4", "5", "2"

        HelperLes5 task1 = new HelperLes5();
        task1.countAndPrint(List.of("1", "2", "2", "4", "3", "1", "4", "5", "2"));

        HelperLes5 task2 = new HelperLes5();
        System.out.println(task2.isIsomorphic("adc","ads"));
        System.out.println(task2.isIsomorphic("aaa","asd"));
        System.out.println(task2.isIsomorphic("asd","sss"));
        System.out.println(task2.isIsomorphic("awweq","fg"));
    }
}
