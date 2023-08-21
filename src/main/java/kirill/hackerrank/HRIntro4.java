package kirill.hackerrank;

import java.util.Scanner;

public class HRIntro4 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scan = new Scanner(System.in);
        String i = scan.nextLine();
        String d = scan.nextLine();
        String str = scan.nextLine();

        Double dd = Double.parseDouble(d);
        sol.str(str);
        sol.d(dd);
        sol.in(i);

//        Scanner scanner = new Scanner(System.in);
//        String i = scanner.nextLine();
//        String d = scanner.nextLine();
//        String str = scanner.nextLine();
//
//        scanner.close();
//
//
//
//        Double dd = Double.parseDouble(d);
//        System.out.println("String: "+str);
//        System.out.println("Double: "+dd);
//        System.out.println("Int: "+i);
    }
}

class Solution{

    public void str(String str){
        System.out.println("String: "+str);
    }
    public void in(String i){
        System.out.println("Int: "+i);
    }
    public void d(Double d){
        System.out.println("Double: "+d);
    }
}