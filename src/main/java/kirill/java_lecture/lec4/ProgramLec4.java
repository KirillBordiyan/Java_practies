package kirill.java_lecture.lec4;


import java.util.*;

/*Разные коллекции существуют чтобы:
1. иметь разные способы обработки данных
2. для решения разных задач

по порядку

LinkedList - двусвязный список
для списка характерно хаотичное размещение данных в памяти,
где (визуально для нас) о каждом следующем элементе известно только предыдущему (односвязный список)

с массивом другая история: все идут друг за другом и чтобы менять размерность массива, надо заного его создавать, копировать предыдущий
и менять ссылку уже на новый массив

при добавлении или удалении элемента в списке меняется связь ссылок данных (т.е вставили на 2 позицию -> с 1 становится ссылка на новое,
а с нового на второй старый и тд), аналогично с удалением.

таким образом, для добавления или удаления выгоднее список, а для чтения массив (из-за меньшего кол-ва действий чтения)

Двусвязный список - список, где каждый элемент знает не только то, что находиться после него, а также то, что было до него

*/

/*
Queue - кью, работает по принципу FIFO    !!!!!
инициализация
Queue<Integer> Qlist = new LinkedList<>();
добавить - Qlist.add(1);
удалить - int item = Qlist.remove(); - будет удален первый элемент который вошел в список!!!

есть такая вещь как PriorityQueue, где наивысший приоритет имеет "наименьший" элемент

еще одним видом является Deque - double ended queue
особенность в том, что можно добавлять/удалять и в начало, и в конец
*/

/*
Stack - обработка данных по принципу LIFO
расширяет Vector 5 операциями, которые позволяют рассматривать вектор как Stack
push(E item)
pop()

 */
public class ProgramLec4 {
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(1);
        llist.add(2);
        llist.add(3);

        System.out.println(llist);

        Queue<Integer> Qlist = new LinkedList<>();
        Qlist.add(1);
        int item = Qlist.remove();

        PriorityQueue<Integer> PQlist = new PriorityQueue<>();
        PQlist.add(123);
        PQlist.add(3);
        PQlist.add(13);
        PQlist.add(1);

        System.out.println(PQlist); //данный уже отсортированы от наименьшего
        //посмотреть очередь можно так:
        System.out.println(PQlist.poll()); //1
        System.out.println(PQlist.poll()); //3
        System.out.println(PQlist.poll()); //13
        System.out.println(PQlist.poll()); //123
        System.out.println(PQlist.poll()); //null - кол-во значений меньше будущего кол-ва попыток вызова

        Deque<Integer> DQlist = new ArrayDeque<>(); //записываются так, как приходят в соответствии с позицией
        DQlist.add(1);
        DQlist.add(12);
        DQlist.add(31);
        DQlist.add(14);
        DQlist.add(51);
        DQlist.add(16);
        DQlist.add(71);
        DQlist.addFirst(444);
        DQlist.addLast(444);
        System.out.println(DQlist);
        DQlist.offerLast(2);
        System.out.println(DQlist);
        System.out.println(DQlist.getLast());

        //вычислить значение выражения в постфиксной форме записи
        //1+2*3 =/= (1+2)*3
        //в постфиксной 123*+ и 12+3*
        //123*+ -> Stack(3 2 1), далее берется 2 последних добавленных элемента 3 и 2
        // к ним применяется * (получаем 6) и результат возвращаем с Stack -> (6 1)
        //аналогично с + -> (7)

        var exp = "1 2 + 3 *".split(" ");
        int result = 0;
        System.out.println(Arrays.toString(exp));

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i< exp.length; i++){
            if(isDigit(exp[i])){
                st.push(Integer.parseInt(exp[i]));
            }else{
                switch (exp[i]){
                    case "+":
                        result = st.pop() + st.pop();
                        st.push(result);
                        break;
                    case "-":
                        result = -st.pop() + st.pop();
                        st.push(result);
                        break;
                    case "*":
                        result = st.pop() * st.pop();
                        st.push(result);
                        break;
                    case "/":
                        result = st.pop() / st.pop();
                        st.push(result);
                        break;
                    default:
                        break;
                    }
                }
            }
        System.out.printf("%d\n", st.pop());
    }
    private static boolean isDigit(String arg)throws NumberFormatException{
    try {
        Integer.parseInt(arg);
        return true;
    }catch (NumberFormatException e){
        return false;
    }
    }
}
