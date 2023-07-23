package kirill.program;

import kirill.helper.Helper;

import java.util.List;

public class programLes1 {

    public static void main(String[] args){
        //1
        int[] array = new int[] {1,1,0,1,1,1};
        System.out.println(Helper.task1(array));

        //2
        int[] arrayTask2 = new int[] {10,3,2,1,3,3,0,4,2,1,3,3};
        Helper.task2(arrayTask2, 3);

        //4
        System.out.println(Helper.task4(List.of("предикат", "предрасположенность")));
        System.out.println(Helper.task4(List.of("предикат")));
        try {
            System.out.println(Helper.task4(List.of()));
        } catch (Exception e) {
            System.out.println("Illegal input");
        }

        //5
        System.out.println(Helper.task5("Добро пожаловать на курс по Java"));

        //6
        System.out.println(Helper.task6(2,3));
        System.out.println(Helper.task6_2(4,5));

    }

//  1 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
//helper

//  2 Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
// а остальные - равны ему
//helper


//  4 Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
//Если общего префикса нет, вернуть пустую строку "".
//helper

//  5 Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
//helper


//Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
//Пример 1: а = 3, b = 2, ответ: 9
//Пример 2: а = 2, b = -2, ответ: 0.25
//Пример 3: а = 3, b = 0, ответ: 1
//helper
}


