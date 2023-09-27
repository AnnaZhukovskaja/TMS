import java.util.Random;

public class Task6 {

    // 6. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.

    public static void main(String[] args) {

        int[][] array = new int[5][5];
        int tmp;

        Random random = new Random();
        System.out.println("Array: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(9);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("New sorted array:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {

                    if (array[i][j] > array[i][k]) {
                        tmp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = tmp;
                    }
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


