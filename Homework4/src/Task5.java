import java.util.Random;

public class Task5 {

    // 5. Создайте двумерный массив. Выведите на консоль диагонали массива.

    public static void main(String[] args) {

        int[][] array = new int[5][5];

        Random random = new Random();
        System.out.println("Array: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(9);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }

        System.out.println();
        System.out.println("Side diagonal: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[array.length - i - 1][i] + " ");
        }
    }
}


