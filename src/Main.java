public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        byte byteVariable = 1;
        System.out.println("Значение переменной byteVariable с типом byte равно " + byteVariable);
        short shortVariable = 100;
        System.out.println("Значение переменной shortVariable с типом short равно " + shortVariable);
        int intVariable = 100 * 500;
        System.out.println("Значение переменной intVariable с типом int равно " + intVariable);
        long longVariable = 110L;
        System.out.println("Значение переменной longVariable с типом long равно " + longVariable);
        float floatVariable = 2.55f;
        System.out.println("Значение переменной floatVariable с типом float равно " + floatVariable);
        double doubleVariable = 0.50;
        System.out.println("Значение переменной doubleVariable с типом double равно " + doubleVariable);


    }

    public static void task2 () {
        System.out.println("Задача 2");
//        Ниже дан список различных значений. Инициализируйте переменные, используйте
//        изученные ранее типы переменных.
//Значения:
//27.12
//987 678 965 549
//2.786
//569
//-159
//27897
//67
        float firstNumber = 27.12F;
        System.out.println(firstNumber);
        long secondNumber = 987678965549L;
        System.out.println(secondNumber);
        double thirdNumber = 2.786;
        System.out.println(thirdNumber);
        short fourthNumber = 569;
        System.out.println(fourthNumber);
        short fifthNumber = -159;
        System.out.println(fifthNumber);
        short sixthNumber = 27897;
        System.out.println(sixthNumber);
        int sixthNumberInt = 27897;
        System.out.println(sixthNumberInt);
        byte seventhNumber = 67;
        System.out.println(seventhNumber);

    }
    public static void task3 () {
        System.out.println("Задача 3");
//    Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
//У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
//Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
//Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
//Для объявления переменных не используйте тип var.
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int childrenTotal = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        short sheetsForChildren = 480;
        int sheetPerChild = sheetsForChildren / childrenTotal;
        System.out.println("На каждого ученика рассчитано " + sheetPerChild + " листов бумаги");
    }
}