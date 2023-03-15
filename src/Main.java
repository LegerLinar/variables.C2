public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
    public static void task4 (){
        System.out.println("Задача 4");
//        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
//за 20 минут,
//в сутки,
//за 3 дня,
//за 1 месяц?
//Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
//Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
//Для объявления переменных не используйте тип var.
        byte machineEfficiencyPer2Min = 16;
        short amount2MinPerDay = 24 * 30;

        int machineEfficiency20Min = machineEfficiencyPer2Min * 10;
        int machineEfficiencyDaily = machineEfficiencyPer2Min * amount2MinPerDay;
        int machineEfficiency3Days = machineEfficiencyDaily * 3;
        int machineEfficiencyMonthly = machineEfficiencyDaily * 30;

        System.out.println("За " + "20 минут" + " машина произвела " + machineEfficiency20Min + " штук бутылок");
        System.out.println("За " + "сутки" + " машина произвела " + machineEfficiencyDaily + " штук бутылок");
        System.out.println("За " + "3 дня" + " машина произвела " + machineEfficiency3Days + " штук бутылок");
        System.out.println("За " + "месяц" + " машина произвела " + machineEfficiencyMonthly + " штук бутылок");


    }
//    На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит
//    2 банки белой и 4 банки
//    коричневой краски. Сколько банок каждой краски было куплено?
//Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски
// и … банок коричневой краски».
//Для объявления переменных не используйте тип var.
    public static void task5 () {
        System.out.println("Задача 5");
        short paintTanksTotal = 120;
        byte whiteTanksPerClass = 2;
        byte brownTanksPerClass = 4;
        int tanksPerClass = whiteTanksPerClass + brownTanksPerClass;
        int classroomAmount = paintTanksTotal / tanksPerClass;
        int whiteTanksTotal = whiteTanksPerClass * classroomAmount;
        int brownTanksTotal = brownTanksPerClass * classroomAmount;

        System.out.println("В школе? где " + classroomAmount + " классов, нужно " + whiteTanksTotal + " банок белой краски и " + brownTanksTotal + " банок коричневой краски");
    }
//    Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
//Вот один из рецептов, по которому спортсмен готовит себе завтрак:
//Бананы — 5 штук (1 банан — 80 грамм).
//Молоко — 200 мл (100 мл = 105 грамм).
//Мороженое-пломбир — 2 брикета по 100 грамм.
//Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
//Смешать всё в блендере — и готово.
//Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
//Результат в граммах и килограммах напечатайте в консоль.
//Важное условие: если в рецепт нужно добавить несколько единиц какого-то продукта
// (с определенным весом), то нужно умножать количество единиц на вес в граммах.
// Например, если в рецепте указано, что нужно добавить 5 бананов по 80 грамм, то нужно
// количество бананов (5) умножить на вес одного (80 грамм), а не считать самим общую сумму граммов.
    public static void task6 () {
        System.out.println("Задача 6");

        byte bananaWeight = 80;
        byte bananaPortion = 5;
        int bananaPortionWeight = bananaPortion * bananaWeight;
        short milkPortion = 200;
        byte milkWeight = 100;
        int milkPortionWeight = milkWeight * milkPortion;
        byte iceCreamPortion = 2;
        byte iceCreamWeight = 100;
        int iceCreamPortionWeight = iceCreamWeight * iceCreamPortion;
        byte eggsPortion = 4;
        byte eggsWeight = 70;
        int eggsPortionWeight = eggsWeight * eggsPortion;
        int breakfastWeight = bananaPortionWeight + milkPortionWeight + iceCreamPortionWeight + eggsPortionWeight;
        System.out.println("Вес завтрака в граммах " + breakfastWeight);
        float kilo = 1000;
        float breakfastWeightKilo = breakfastWeight / kilo;
        System.out.println("Вес завтрака в килограммах " + breakfastWeightKilo);

    }
    public static void task7(){
        System.out.println("Задача 7");
//        Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
//        Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
//Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько
// — если каждый день будет худеть на 500 грамм.
//Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
//Результаты всех подсчетов выведите в консоль.
        byte weightLossGoalKg = 7;
        int weightLossGoalGram = weightLossGoalKg * 1000;
        short weightLossDailyMin = 250;
        short weightLossDailyMax = 500;
        int weightLossDailyMid = (weightLossDailyMax + weightLossDailyMin) / 2;

        int expectedGoalReachWorst = weightLossGoalGram / weightLossDailyMin;
        int expectedGoalReachBest = weightLossGoalGram / weightLossDailyMax;
        int expectedGoalReachMid = weightLossGoalGram / weightLossDailyMid;

        System.out.println("Спортсмен избавится от 7 кг в течение " + expectedGoalReachBest + " дней в лучшем случае");
        System.out.println("Спортсмен избавится от 7 кг в течение " + expectedGoalReachWorst + " дней в худшем случае");
        System.out.println("Спортсмен избавится от 7 кг в течение " + expectedGoalReachMid + " дней при усредненных расчетах");
    }

//Задача 8
//Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
// В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники,
// которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
// Каждый год повышение составляет 10% от текущей зарплаты.
//К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
//Маша получает 67 760 рублей в месяц.
//Денис получает 83 690 рублей в месяц.
//Кристина получает 76 230 рублей в месяц.
//Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать
// разницу между годовым доходом с нынешней зарплатой и после повышения.
//Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
//Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
    public static void task8(){
        System.out.println("Задача 8");

        float salaryMaria = 67760;
        float salaryDenis = 83690;
        float salaryKristina = 76230;

        float salaryMariaDif = salaryMaria / 100;
        float salaryDenisDif = salaryDenis / 100;
        float salaryKristinaDif = salaryKristina / 100;

        float salaryMariaNew = salaryMaria + salaryMariaDif * 10;
        float salaryDenisNew = salaryDenis + salaryDenisDif * 10;
        float salaryKristinaNew = salaryKristina + salaryKristinaDif * 10;

        System.out.println("Новая зарплата Марии составляет " + salaryMariaNew + " руб.");
        System.out.println("Новая зарплата Дениса составляет " + salaryDenisNew + " руб.");
        System.out.println("Новая зарплата Кристины составляет " + salaryKristinaNew + " руб.");

        float salaryMariaYearlyBefore = salaryMaria * 12;
        float salaryDenisYearlyBefore = salaryDenis * 12;
        float salaryKristinaYearlyBefore = salaryKristina * 12;


        float salaryMariaYearlyNew = salaryMariaNew * 12;
        float salaryDenisYearlyNew = salaryDenisNew * 12;
        float salaryKristinaYearlyNew = salaryKristinaNew * 12;

        float yearlySalaryMariaDif = salaryMariaYearlyNew - salaryMariaYearlyBefore;
        float yearlySalaryDenisDif = salaryDenisYearlyNew - salaryDenisYearlyBefore;
        float yearlySalaryKristinaDif = salaryKristinaYearlyNew - salaryKristinaYearlyBefore;

        System.out.println("Годовой доход Марии вырос на " + yearlySalaryMariaDif + " рублей");
        System.out.println("Годовой доход Дениса вырос на " + yearlySalaryDenisDif + " рублей");
        System.out.println("Годовой доход Кристины вырос на " + yearlySalaryKristinaDif + " рублей");


    }
}
