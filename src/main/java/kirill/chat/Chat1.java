package kirill.chat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Chat1 {
    public static void main(String[] args) {

        //1
        ArrayList<String> arr = new ArrayList<>();
        arr.add("asd");
        arr.add("AAA");
        arr.add("ads");
        arr.add("AOP");


        List<String> newa = streamsString(arr);
        System.out.println(newa);

        //2
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(11);
        integerList.add(12);
        integerList.add(11);
        integerList.add(14);
        integerList.add(14);
        integerList.add(3);

        Integer sum = sumOf(integerList);
        System.out.println(sum);

        //3
        Person tom = new Person("Tom", 25);
        Person bob = new Person("Bob", 20);
        Person john = new Person("john", 26);
        Person mike = new Person("mike", 15);

        List<Person> personList = new ArrayList<>();
        personList.add(tom);
        personList.add(bob);
        personList.add(john);
        personList.add(mike);

        List<Person> newPL = ageSort(personList);
        for (Person item: newPL) {
            System.out.println(item.getName());
        }


        //4

    }
//    1. Напишите функцию, которая принимает список строк и возвращает новый список строк,
//    содержащий только те строки, которые начинаются с буквы "A".
//    Используйте stream и лямбды.

    public static List<String> streamsString(List<String> listOfString){
        return listOfString.stream()
                .filter(item -> item.startsWith("A"))
                .collect(Collectors.toList());
    }


//    2. Напишите функцию, которая принимает список целых чисел и возвращает
//    сумму всех нечетных чисел в списке. Используйте stream и лямбды.

    public static Integer sumOf(List<Integer> list){
        return list.stream()
                .filter(item -> item % 2 != 0)
                .reduce(0, (Integer::sum));
    }

//    3. Напишите функцию, которая принимает список объектов класса Person (с полями name и age)
//    и возвращает новый список объектов Person, отсортированный по возрастанию возраста.
//    Используйте stream и лямбды.

    public static List<Person> ageSort(List<Person> listP){
        return listP.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());
    }
}


class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


