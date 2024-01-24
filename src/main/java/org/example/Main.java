package org.example;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int a = 0, b = 0;
        String operation = "";
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите операцию:");
            operation = in.next();
//            if (operation == "x") {
//                System.out.println("Досвидос");
//                System.exit(0);
//            }
            System.out.println("Введите первое число: ");
            a = in.nextInt();

            System.out.println("Введите второе число: ");
            b = in.nextInt();

            switch (operation) {
                case "+": {
                    System.out.printf("Результат: a+b=%d\n", a + b);
                    break;
                }
                case "-": {
                    System.out.printf("Результат a-b=%d\n", a - b);
                    break;
                }
                case "x": {
                    System.exit(0);
                    break;
                }

            }

        }

    }

//    public static void main(String[] args) {
//
//        // Типы данных
//        byte count = 0; // хранит целое число от -128 до 127 и занимает 1 байт
//        int count2 = 1; // хранит целое число от -32768 до 32767 и занимает 2 байта
//        short count3 = 2; // хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
//        long count4 = 3; // хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
//
//        double price = 31.2; // хранит число с плавающей точкой от ±4.9*10-324 до ±1.7976931348623157*10308 и занимает 8 байт
//        float price2 = 31.2F; //  хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта
//
//        String names = "";
//        String description = """
//                Вот мысль, которой весь я предан,
//                Итог всего, что ум скопил.
//                Лишь тот, кем бой за жизнь изведан,
//                Жизнь и свободу заслужил.
//                """;
//
//        char ch = 'e';
//        char ch2 = 102;
//
//        boolean isCheck = true;
//
//
//        // Вывод данных на консоль
//        System.out.println("Hello world!");
//        System.out.print("Hello world!");
//
//
//        int x = 5;
//        int y = 6;
//        System.out.println("x=" + x + "; y=" + y);
//        System.out.printf("x=%d; y=%d \n", x, y);
//
//        /**
//         * Кроме спецификатора %d мы можем использовать еще ряд спецификаторов для других типов данных:
//         * %x: для вывода шестнадцатеричных чисел
//         * %f: для вывода чисел с плавающей точкой
//         * %e: для вывода чисел в экспоненциальной форме, например, 1.3e+01
//         * %c: для вывода одиночного символа
//         * %s: для вывода строковых значений
//         **/
//
//        String name = "Tom";
//        int age = 30;
//        float height = 1.7f;
//        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
//
//
//        // Ввод данных с консоли
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a number: ");
//        int num = in.nextInt();
//        System.out.printf("Your number: %d \n", num);
//        in.close();
//
//        /**
//         * Класс Scanner имеет еще ряд методов, которые позволяют получить введенные пользователем значения:
//         * next(): считывает введенную строку до первого пробела
//         * nextLine(): считывает всю введенную строку
//         * nextInt(): считывает введенное число int
//         * nextDouble(): считывает введенное число double
//         * nextBoolean(): считывает значение boolean
//         * nextByte(): считывает введенное число byte
//         * nextFloat(): считывает введенное число float
//         * nextShort(): считывает введенное число short
//         **/
//
//        // Арифмитические операции
//
//        int summ = (2 + 2 - 2 / 2 * 2) % 2; // Сложение вычитание умножение деление и нахождения процента от остатка
//
//        //++ (префиксный инкремент)
//        int a = 8;
//        int b = ++a;
//        System.out.println(a);  // 9
//        System.out.println(b);  // 9
//
//        // ++ (постфиксный инкремент)
//        int b2 = a++;
//        System.out.println(a);  // 9
//        System.out.println(b2);  // 8
//
//
//        // -- (префиксный декремент)
//        int b3 = --a;
//        System.out.println(a);  // 7
//        System.out.println(b3);  // 7
//
//        // -- (постфиксный декремент)
//        int b4 = a--;
//        System.out.println(a);  // 7
//        System.out.println(b4);  // 8
//
//
//        //Логические операции
//        int a1 = 10;
//        int b1 = 4;
//        boolean c = a1 == b1;         // false
//        boolean d = a1 == 10;       // true
//
//        boolean c1 = a1 != b1;         // true
//        boolean d1 = a1 != 10;       // false
//
//        boolean c2 = a1 < b1;   // false
//
//        boolean c3 = a1 > b1; // true
//
//        boolean c4 = 10 >= 10;    // true
//        boolean b5 = 10 >= 4;     // true
//        boolean d4 = 10 >= 20;    // false
//
//        boolean c5 = 10 <= 10;    // true
//        boolean b6 = 10 <= 4;     // false
//        boolean d5 = 10 <= 20;    // true
//
//
//        boolean a5 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
//        boolean a6 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false, поэтому возвращается false
//        boolean a7 = (5 > 6) && (4 < 6); // 5 > 6 - false, поэтому возвращается false (4 < 6 - true, но не вычисляется)
//        boolean a8 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается true
//        boolean a9 = (5 < 6) ^ (4 > 6); // 5 < 6 - true, поэтому возвращается true (4 > 6 - false)
//        boolean a10 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается false
//
//        boolean a11 = (5 > 6) ^ (4 < 6); // true
//        System.out.println(a11);
//
//
//        // Условные конструкции
//
//        /**
//         *  if(условие){
//         *      блок кода
//         *  } else {
//         *      блок кода
//         *  }
//         *
//         *  if  условие
//         *      блок кода но одна строка
//         *  else
//         *      блок кода но одна строка
//         *
//         *  условие ? выполняется код если условие true : выполняется если условие false
//         *
//         *  int x=3;
//         *  int y=2;
//         *  int z = x > y? (x+y) : (x-y);
//         *
//         */
//
//        // Оператор выбора
//
//        /**
//         * switch(переменная){
//         *  case 1:{
//         *      блок кода
//         *      break;
//         *  }
//         *  case 2:
//         *      Одна строчка кода
//         *      break;
//         *
//         *  case 3:
//         *  case 4:
//         *  case 5:{
//         *      блок кода
//         *  }
//         *
//         *  default:{
//         *      блок кода
//         *      break;
//         *  }
//         * }
//         *
//         */
//
//        // Циклы
//
//        /**
//         * for([иницилизация счетчика];[условие];[изменение счетчика]){
//         *      блок кода
//         * }
//         *
//         * for(тип_данных название_переменной : контейнер){
//         *      блок кода
//         * }
//         *
//         * for(int i : array){
//         *      System.out.println(i);
//         * }
//         *
//         * for(int i = 0; i <= 10; i++){
//         *      System.out.println(i);
//         * }
//         *
//         * for(;;){
//         * }
//         *
//         * while(условие){
//         *  блок кода
//         * }
//         *
//         * do {
//         *  блок кода
//         * } while(уловие)
//         *
//         * break - выход из цикла
//         * continue - пропустить одну итерацию
//         */
//
//
//        // Массивы
//
//        /**
//         *  тип_данных название_перменной[]
//         *  тип_данных[] название_перменной
//         *
//         *  int mass[];
//         *  int[] mass;
//         *
//         *  int[] mass = new int[5];
//         *  int mass[] = new int[5];
//         *
//         *  int[] nums = new int[] { 1, 2, 3, 5 };
//         *  int[] nums2 = { 1, 2, 3, 5 };
//         *
//         *  много мерные массивы
//         *
//         *  int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };
//         *  int [][] test = new int[1][1];
//         */
//
//        // Методы
//
//    }


}

