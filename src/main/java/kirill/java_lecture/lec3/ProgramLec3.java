package kirill.java_lecture.lec3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.awt.geom.QuadCurve2D;
import java.lang.reflect.Type;

public class ProgramLec3 {
    public static void main(String[] args) {
        //object
//        System.out.println(Sum(1,2));
//        System.out.println(Sum(1.0,2));
//        System.out.println(Sum(1,2.0));
//        System.out.println(Sum(1.3,2.2));

        ArrayList list = new ArrayList(); //"удоный массив", но это НЕ МАССИВ
        list.add(5000);
        list.add("999");

//        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> list3 = new ArrayList<>(10); - выделение места под 10 элементов
//        ArrayList<Integer> list4 = new ArrayList<>(list3); - копирование list3
        //List - пронумерованный набор элементов
        //имеется точный контроль, где вставляется элемент
        //ArrayList,LinkedList (Vector, Stack - устаревшие)
        for (Object o: list) {
            System.out.println(o);
            
        }




    }

//    static Object Sum(Object a, Object b) {
//        if(a instanceof Double && b instanceof Double){
//            return (Object) ((Double) a + (Double) b);
//        }else if(a instanceof Integer && b instanceof Integer){
//            return (Object) ((Integer) a + (Integer) b);
//        }else{
//            return (Object) 0;
//        }
//    }



}
