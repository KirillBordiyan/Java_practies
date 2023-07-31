package kirill.program;

import kirill.helper.HelperLes4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ProgramLes4 {
    public static void main(String[] args) {
        // Реализовать консольное приложение, которое принимает строки и запоминает их.
        // Если введено print, то нужно вывести в консоль строки так, что последняя введеная является первой в списке
        // Если введено revert, то удаляем последнюю введную строку

        Scanner scanner = new Scanner(System.in);
        Deque<String> dq = new ArrayDeque<>();
        HelperLes4 hp4 = new HelperLes4();
        hp4.task1(scanner,dq);

    }
}


