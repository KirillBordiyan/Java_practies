package lec1;
// import java.util.Scanner;
// import java.io.*;
public class lec_1 {
    public static void main(String[] args) {
        // short age = 10;
        // int salary = 123456;
        // System.out.println(age); //10
        // System.out.println(salary); //123456


        // float e = 2.7f;
        // double pi = 3.1415;
        // System.out.println(e); // 2.7
        // System.out.println(pi); // 3.1415



        // char ch = '1';
        // System.out.println(Character.isDigit(ch)); // true
        // ch = 'a';
        // System.out.println(Character.isDigit(ch)); // false


        // boolean flag1 = 123 <= 234;
        // System.out.println(flag1); // true
        // boolean flag2 = 123 >= 234 || flag1;
        // System.out.println(flag2); // true
        // boolean flag3 = flag1 ^ flag2;
        // System.out.println(flag3); // false


        //классы - обертки
        int d = 213_000;
        System.out.println(d); //213000
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        //операции
        int q = 123;
        q++; //124
        System.out.println(q); //124
        System.out.println(q++); //124
        System.out.println(q); //125
        System.out.println(++q); //126
        int a = 123;
        a = a-- - --a;
        System.out.println(a);


        //если инкремент в выводе - приоритет вывода выше, +1 будет после
        //если в выводе инкремент ++q - будет +1, потом вывод
        //аналогично с декрементом
        // ++q - префиксный (>вывод)
        // q++ - посфиксный (<вывод) как в шарпе


        int t = 8; //1000
        // t = t << 1;
        System.out.println(t << 1); // 10000 =16
        int t2 = 18; //10010
        System.out.println(t2 >> 1); //1001 =9


        int w = 5;
        int r = 2;
        System.out.println(w | r);
        // 101 = 5
        // 010 = 2, 1 или 0? - 1, записали, и тд
        // 111 = 7
        System.out.println(w & r);
        //101
        //010, 1 и 0 это 0, записали и тд
        //000 = 0
        System.out.println(w ^ r);
        //1истино0ложь1истино
        //0ложь1истино0ложь
        //1истино1истино1истино = 7

        //коньвьюнкцией 2 высказываний называется истинное тогда и только тогда, когда оба истинны
        // String s = "qwer";
        // boolean x = s.length() >= 5 && s.charAt(4) == '1'; //false - если одно false, то второе тоже
        // boolean x = s.length() >= 5 & s.charAt(4) == '1'; // error, всегда обязательно проверит 2 условия
        //аналогично ИЛИ (||), только когда одно истинно


        // массивы
        int[] arr = new int[10];
        arr[3] = 13;
        System.out.println(arr[3]);


        // преобразование
        int i = 123; double y = i;
        System.out.println(i); // 123
        System.out.println(y); // 123.0
        y = 3.1415; i = (int)d;
        System.out.println(d); // 3.1415
        System.out.println(i); // 3
        y = 3.9415; i = (int)d;
        System.out.println(d); // 3.9415
        System.out.println(i); // 3
        byte b = Byte.parseByte("123");
        // System.out.println(b); // 123
        // b = Byte.parseByte("1234"); //от -256 до 255
        System.out.println(b); // NumberFormatException: Value out of range

        // НО, нельзя
        // int[] array = new int[10];
        // double[] darray = array; // ИЗУЧАЕМ ковариантность и контравариантность


        // получение строки из терминала 
        //1 строка сверху
        // *Scanner iScanner = new Scanner(System.in);
        // *System.out.printf("name: ");
        // *String name = iScanner.nextLine();
        // *System.out.printf("Привет, %s!", name);
        // *iScanner.close();
        //получение примитивов
    //     *Scanner iScanner = new Scanner(System.in);
    //     *System.out.printf("int a: ");
    //     *int x = iScanner.nextInt();
    //    * System.out.printf("double a: ");
    //     *double n = iScanner.nextDouble();
    //    * System.out.printf("%d + %f = %f", x, n, x + n);
    //     *iScanner.close();
        //считываем при возможноти:
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt(); //если можно превести в int, делаем
        // System.out.println(flag);
        // int k = iScanner.nextInt();
        // System.out.println(k);
        // iScanner.close();

        int z = 1, v = 2;
        int c = z + v;
        String res = String.format("%d + %d = %d \n", z, v, c); //пиется формат, потом последовательно то, что будет подставляться
        System.out.printf("%d + %d = %d \n", z, v, c);
        System.out.println(res);

        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00




        // область видимости
            //что внутри не может быть видно снаружи
            // что снаружи не может быть видно внутри
                // {
                // int j = 123;
                // System.out.println(j);
                // }
                // System.out.println(j); // error: cannot find symbol
            
            sayHi();
            System.out.println(summary(10, 3));


        //условный оператор
            // int aa = 1;
            // int bb = 2;
            // int cc;
            // if (aa > bb) {
            // cc = aa;
            // } else {
            // cc = bb;
            // }
            // System.out.println(cc);
            //или так:
            // int a = 1;
            // int b = 2;
            // int c = 0;
            // if (a > b) c = a;
            // if (b > a) c = b;
            // System.out.println(c);

        //тернарный оператор - сокращенный конструктор if.. else
            // int a3 = 1;
            // int b3 = 2;
            // int min = a3 < b3 ? a3 : b3;
            // System.out.println(min);

        //оператор выбора 
            // int mounth = value;
            // String text = "";
            // switch (mounth) {
            //     case 1:
            //         text = "Autumn";
            //         break;
            //     default:
            //         text = "mistake";
            //         break;
            // }
            // System.out.println(text);
            // iScanner.close();


        //циклы while,do-while, for, for-in (==foreach)
            // int value = 3241;
            // int count = 0;

            // while (value != 0){
            //     value /= 10;
            //     count++;
            // }
            // System.out.println(count);

            // int value = 3241;
            // int count = 0;
            // do{
            //     value /= 10;
            //     count++;
            // }while(value != 0);
            // System.out.println(count);


            // int a4  = 0;
            // for (int ii = 0; ii < 10; ii++) {
            //     a4 += ii;
            // }
            // System.out.println(a4);


            // int[] arr2 = new int[] {1,2,3,4,5};
            // for (int jj : arr2) { //foreach не меняет item
            //     System.out.println(jj*jj);
            // }


            //работа с файлами, создание/запись
                // try (FileWriter fw = new FileWriter("file.txt", false)) { //true false отвечает за запись, надо или нет 
                //         fw.write("line 1");
                //         fw.append('\n');
                //         fw.append('2');
                //         fw.append('\n');
                //         fw.write("line 3");
                //         fw.flush();
                //     } catch (IOException ex) {
                //         System.out.println(ex.getMessage());
                //     }



            //чтение посимвольно
            //throws Exception дописывается в точке входа после аргументов вне скобок
            //+5 строка
            // FileReader fr = new FileReader("file.txt");
            // int c2;
            // while ((c2 = fr.read()) != -1) {
            //     char ch = (char) c2;
            //     if (ch == '\n') {
            //         System.out.print(ch);
            //     } else {
            //         System.out.print(ch);
            //         }
            //     }

            //построчно +5 строка
            // BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            // String str;
            // while ((str = br.readLine()) != null) {
            //     System.out.printf("== %s ==\n", str);
            // }
            // br.close();
    }
        //функции
        //обязательно должен быть класс, без него никак
    static void sayHi() {
            System.out.println("hi");
        }
    static int summary(int a, int b){
        int result = a +b;
        return result;
    }

    
}
