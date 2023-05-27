

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }


    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        int[] massiv1 = generateRandomArray();

        System.out.println("Задачa 1");
        // Напишите программу, которая решит эту задачу, и выведите в консоль
        // результат в формате: «Сумма трат за месяц составила … рублей».
        for (int currentMonth : massiv1) {
            System.out.println("Сумма трат за месяц = " + currentMonth + " руб.");
        }


    }


    public static void task2() {
        int[] massiv2 = generateRandomArray();

        System.out.println();
        System.out.println("Задачa 2");
        //Напишите программу, которая выведет в консоль результат в формате:
        // «Минимальная сумма трат за день составила … рублей.
        // Максимальная сумма трат за день составила … рублей».

        int minMoney = massiv2[0];
        int maxMoney = massiv2[0];
        for (int currentMoney : massiv2) {
            if (currentMoney < minMoney) {
                minMoney = currentMoney;
            }
            if (currentMoney > maxMoney) {
                maxMoney = currentMoney;
            }
        }

//        System.out.println("Массив:");
//        for (int element : massiv2) {
//            System.out.println(element);
//        }
        System.out.println("Минимальная сумма трат = " + minMoney + " руб.");
        System.out.println("Максимальная сумма трат = " + maxMoney + " руб.");
    }


    public static void task3() {
        int[] massiv3 = generateRandomArray();

        System.out.println();
        System.out.println("Задачa 3");
        // Напишите программу, которая посчитает среднее значение трат за месяц
        // (то есть сумму всех трат за месяц поделить на количество дней),
        // и выведите в консоль результат в формате:
        // «Средняя сумма трат за месяц составила … рублей».
        int summ = 0;
        for (int element3 : massiv3) {
            summ += element3;
        }
        float srednee = summ / massiv3.length;
        System.out.println("Средняя сумма трат за месяц составила " + srednee + " руб.");

    }


    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        System.out.println();
        System.out.println("Задачa 4");
        // Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
        // В результате в консоль должно быть выведено: Ivanov Ivan.
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}

