import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
                System.out.println("Задачи 1-2");
        // Объявите три массива по условиям.
        // Распечатайте на отдельной строчке элементы каждого массива
        // по порядку через запятую. В конце строки запятую ставить не надо.
        int []    massiv1 = new int[] {1, 2, 3};
        double [] massiv2 = {1.57, 7.654, 9.986};
        int []    massiv3 = {17, 3, 24, 73, 16};

        System.out.println("Массив-1:");
        System.out.println(Arrays.toString(massiv1));
        System.out.println("Массив-2:");
        System.out.println(Arrays.toString(massiv2));
        System.out.println("Массив-3:");
        System.out.println(Arrays.toString(massiv3));


        System.out.println("Задача 3");
        // Распечатайте на отдельной строчке элементы каждого массива
        // в обратном порядке через запятую. В конце строки запятую ставить не надо.

        for (int i = massiv1.length - 1; i >= 0 ; i--) {
            System.out.print(massiv1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = massiv2.length - 1; i >= 0 ; i--) {
            System.out.print(massiv2[i]);
            if (i!=0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = massiv3.length - 1; i >= 0 ; i--) {
            System.out.print(massiv3[i]);
            if (i !=0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Задача 4");
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем
        // сделайте четными (нужно прибавить 1).
        for (int i = 0; i < massiv1.length; i++) {
            if (massiv1 [i] %2 != 0) {
                massiv1[i]++;
                            }
        }

        System.out.println(Arrays.toString(massiv1));

    }


}

