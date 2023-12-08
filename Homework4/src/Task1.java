import java.util.Random;
import java.util.Scanner;

public class Task1 {

    // 1. Создать трехмерный массив из целых чисел. С помощью
    //циклов "пройти" по всему массиву и увеличить каждый
    //элемент на заданное число. Пусть число, на которое будет
    //увеличиваться каждый элемент, задается из консоли.

    public static void main(String[] args) {

        int[][][] array = new int[2][3][4];

        Random random = new Random();
        System.out.println("Array: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    array[i][j][k] = random.nextInt(9);
                    System.out.print("array[" + i + "][" + j + "][" + k + "]" + "=" + array[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Please enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("New array: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    array[i][j][k] = array[i][j][k] + number;
                    System.out.print("array[" + i + "][" + j + "][" + k + "]" + "=" + array[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
