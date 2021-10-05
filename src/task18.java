import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во строк в массиве: ");
        int String = scanner.nextInt();
        System.out.print("Введите кол-во столбцов в массиве: ");
        int col = scanner.nextInt();
        int[][] arrayMy = new int[String][col];

        printArray(arrayMy);
        fillArray(arrayMy, scanner);
        swapFirstAndLastColumn(arrayMy);
        printArray(arrayMy);
    }

    private static void fillArray(int[][] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Введите " + i + " " + j + " элемент массива: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
    }

    private static void printArray(int[][] array) {
        System.out.println("Ваш массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void swapFirstAndLastColumn(int[][] array) {
        int[] tempArray = new int[array[0].length];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i][0];
            array[i][0] = array[i][array[0].length - 1];
            array[i][array[0].length - 1] = tempArray[i];
        }
        System.out.println();
    }
}









