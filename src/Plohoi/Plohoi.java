package Plohoi;

import java.util.Scanner;

public class Plohoi {
    public static void main(String[] args) {
        summa();
    }

    private static void summa() {
        Scanner scanner = new Scanner(System.in);
        double[] massiv = new double[10];
        double sum = 0;
        System.out.print("Введите 10 элементов массива: ");

        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = scanner.nextDouble();
            sum += massiv[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}
