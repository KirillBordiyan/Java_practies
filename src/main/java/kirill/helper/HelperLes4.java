package kirill.helper;

import java.util.Deque;
import java.util.Scanner;

public class HelperLes4 {
    public void task1(Scanner scanner, Deque<String> dq){

        while(true) {
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            if("print".equals(input)){
                System.out.println(dq);
            } else if ("revert".equals(input)) {
                dq.pollFirst();
            }else{
                dq.addFirst(input);
            }
        }
        System.out.println("END");
    }
}
