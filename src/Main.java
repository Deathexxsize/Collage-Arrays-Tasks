import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n 1 задание\n");

        // Task 1 | start

        int[] task1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int num : task1) {
            System.out.println("Таблица умножения для числа " + num + ":");
            for (int i = 1; i <= 10 ; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }

            System.out.println();
        }

        // Task 1 | end

        System.out.println("\n 2 задание\n");

        // Task 2 | start

        Random random = new Random();

        int[] task2 = new int[15];
        for (int i = 0; i < task2.length; i++) {
            task2[i] = random.nextInt(1, 100);
        }


        int even = 0;
        int notEven = 0;

        for (int i = 0; i < task2.length; i++) {
            if (task2[i] % 2 == 0) {
                even++;
            } else
                notEven++;
        }

        System.out.println("Четные числа: " + even);
        System.out.println("Не четные числа: " + notEven);

        // Task 2 | end


        System.out.println("\n 3 задание\n");


        // Task 3 | start

        Scanner scanner = new Scanner(System.in);

        int[] task3 = new int[random.nextInt(5, 10)];

        for (int i = 0; i < task3.length; i++) {

            if (i == task3.length - 1){
                System.out.print("Введите последнее число: ");
                task3[i] = scanner.nextInt();
            } else {
                System.out.print("Введите число: ");
                task3[i] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.toString(task3));

        // Task 3 | end

        System.out.println("\n 4 задание\n");

        // Task 4 | Start

        int[] task4 = new int[25];

        for (int i = 0; i < task4.length; i++) {
            task4[i] += random.nextInt(1,10);
        }
        System.out.println(Arrays.toString(task4));

        int j = 1;
        for (int i = 0; i < task4.length - 1; i++) {
            if (task4[i] == task4[j]) {
                System.out.println(task4[i] + ", " + task4[j]);
            }
            j++;
        }

        // Task 4 | End

        System.out.println("\n 5 задание\n");

        // Task 5 | Start

        int[] task5 = new int[99];

        int num = 1;
        for (int i = 0; i < task5.length; i++) {
            task5[i] += num;

            num++;
        }
        System.out.println(Arrays.toString(task5));

        for (int i = 0; i < task5.length / 2; i++) {
            int temp = task5[i];
            task5[i] = task5[task5.length - i - 1];
            task5[task5.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(task5));

        // Task 5 | end

        System.out.println("\n 6 задание\n");

        // Task 6 | start






        // Task 6 | end

        System.out.println("\n 7 задание\n");

        // Task 7 | start

        int[] task7 = new int[10];

        for (int i = 0; i < task7.length; i++) {
            task7[i] += random.nextInt(1, 10);
        }

        System.out.println(Arrays.toString(task7));

        int temp1 = 0;
        int num1 = 1;
        for (int i = 0; i < task7.length; i++) {
            if (task7[i] < task7[num1]) {
                temp1 = task7[i];
            }
        }
        System.out.println("Наименьшее число: " + temp1);

        // Task 7 | end

        System.out.println("\n 8 задание\n");

        // Task 8 | start

        int[] task8 = new int[10];

        for (int i = 0; i < task8.length; i++) {
            task8[i] = random.nextInt(1, 10);
        }

        System.out.println(Arrays.toString(task8));

        for (int i = 0; i < task8.length - 1; i++) {
            for (int k = 0; k < task8.length - 1; k++) {
                if (task8[k] > task8[k + 1]) {
                    int temp = task8[k];
                    task8[k] = task8[k + 1];
                    task8[k + 1] = temp;
                }
            }
        }
        System.out.println("Массив по возростанию: " + Arrays.toString(task8));

        for (int i = 0; i < task8.length / 2; i++) {
            int temp = task8[i];
            task8[i] = task8[task8.length - i - 1];
            task8[task8.length - i - 1] = temp;
        }
        System.out.println("Массив по убыванию: " + Arrays.toString(task8));

        // Task 8 | end

        System.out.println("\n 9 задание\n");

        // Task 9 | start

        int[] task9 = new int[5];
        int[] task9_1 = new int[5];

        for (int i = 0; i < task9.length; i++) {
            task9[i] = random.nextInt(0, 5);
            for (int k = 0; k < task9_1.length; k++) {
                task9_1[k] = random.nextInt(0, 5);
            }
        }

        System.out.println("Первый массив: " + Arrays.toString(task9) + "\nВторой массив: " + Arrays.toString(task9_1));

        double temp2 = 0;
        double temp3 = 0;
        for (int i = 0; i < task9.length; i++) {
            temp2 += task9[i];
            for (int k = 0; k < task9_1.length; k++) {
                temp3 += task9_1[k];
            }
        }

        System.out.println("Среднее значение первого массива: " + temp2 / task9.length);
        System.out.println("Среднее значение второго массива: " + temp3 / task9_1.length);

        // Task 9 | end

        System.out.println("\n 10 задание\n");

        // Task 10 | start

        int[] task10 = new int[11];

        for (int i = 0; i < task10.length; i++) {
            task10[i] = random.nextInt(-1, 1);
        }

        System.out.println(Arrays.toString(task10));


        int num4 = 0;
        int num5 = 0;
        int num6 = 0;

        for (int i = 0; i < task10.length; i++) {
            if (task10[i] == -1) {
                num4++;
            } else if (task10[i] == 0) {
                num5++;
            } else if (task10[i] == 1) {
                num6++;
            }
        }

        if (num4 > num5 && num4 > num6) {
            System.out.println("-1 встречается " + num4 + " раз");
        } else if (num5 > num6 && num5 > num4) {
            System.out.println("0 встречается " + num5 + " раз");
        } else {
            System.out.println("1 встречается " + num6 + " раз");
        }
        
        // Task 10 | end

    }
}