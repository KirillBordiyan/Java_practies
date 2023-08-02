package kirill.java_lecture.lec5;


import java.util.*;

/*
Map - множество кол-й, работающих с данными по принципу Ключ(уникален)-Значение

в HashMap элементы располагаются как угодно и могут менять свое местоположение

Ключевые особенности:
-ускоряет обработку данных
-порядок составления/добавления не запоминается
-есть null-значения

Map<Integer, String> db = new HashMap<>();

для любознательности
-хэш функции и хэш-таблицы
-прямое связывание (хэшир с цепочками)
-хэшир с открытой адресацией
-теория графов
    --деревья, построенные на списках
    --бинарные деревья
    --сбалансированные деревья
    --алгоритм балансировки дерева
    --красно-черные деревья, деревья поиска


 */

/*
TreeMap - сразу упорядочивает вносимое, функционал ниже (пример)
 */

/*
LinkedHashMap - старший брат HashMap'a, он помнит порядок добавления элемента, из-за чего медленнее
для скорости лучше HashMap (или TreeMap)
 */
/*
HashTable - устар, не знает про null
 */
public class ProgramLec5 {
    public static void main(String[] args) {

        Map<Integer, String> db = new HashMap<>();
        db.put(1,"один"); //добавляет или перезаписывает уже существующее
        db.putIfAbsent(4,"4"); //проверяет, есть ли на этом месте что-то и если да, то ничего не меняет, если нет - добавит
        System.out.println(db);
        db.put(null, "!null");
        db.put(2,"2");
        db.put(3,"tri");
        System.out.println(db);
//        put(K,V) – добавить пару если или изменить значение,если ключ имеется.
//        putIfAbsent(K,V) – произвести добавление если ключ не найден.
//        get(K) - получение значения по указанному ключу.
//        remove(K) – удаляет пару по указанному ключу.
//        containsValue(V) – проверка наличия значения.
//        containsKey(V) – проверка наличия ключа.
//        keySet() – возвращает множество ключей.
//        values() – возвращает набор значений.

        System.out.println(db.values());
        for (var item: db.entrySet()) {//вариант пробежаться по словарю
            System.out.printf("%d: %s\n", item.getKey(), item.getValue());
        }

        Map<Integer, String> db2 = new HashMap<>(9); //кол-во ключей
        Map<Integer, String> db3 = new HashMap<>(9,1.0f);
        //кол-во элементов + % соотношение "есть/можно", чтобы величина удваивалась, по умолчанию 75%


        //=========== TreeMap ======= -упорядочиваются по ключу(??)
        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"один"); System.out.println(tMap);
        // {1=один}
        tMap.put(6,"шесть"); System.out.println(tMap);
        // {1=один, 6=шесть}
        tMap.put(4,"четыре"); System.out.println(tMap);
        // {1=один, 4=четыре, 6=шесть}
        tMap.put(3,"три"); System.out.println(tMap);
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"два"); System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}
        System.out.println(tMap.firstEntry());
//
//        put(K,V) -добавить
//        get(K) - получить
//        remove(K) - удлить
//        descendingMap() + descendingKeySet(V) - в обратном порядке и получение самих ключей
//        tailMap()+headMap() - больше и меньше чем
//        lastEntry()+ firstEntry() - первая и последняя пары


        //=========== LinkedHashMap =======
        LinkedHashMap<Integer, String> Lhm = new LinkedHashMap<>();
        Map<Integer,String> linkmap = new LinkedHashMap<>();
        Lhm.put(11, "один один");
        Lhm.put(1, "два");
        Lhm.put(2, "один");
        System.out.println(Lhm); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}

        //========HashTable ==
        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); // java.lang.NullPointerException
    }
}
