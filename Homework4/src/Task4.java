
import java.util.Random;


public class Task4 {

    // 4. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.

    public static void main(String[] args) {

        int[][] array = new int[5][5];
        int sumOfAllElements = 0;
        Random random = new Random();
        System.out.println("Array: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(9);
                System.out.print(array[i][j] + " ");
                sumOfAllElements = sumOfAllElements + array[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum all elements = " + sumOfAllElements);
    }

}



