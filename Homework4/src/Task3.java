public class Task3 {

    // 3. Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы). Напишите программу для умножения двух
    // матриц.
    //Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
    //Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
    //Ожидаемый результат: 1 2 3 1 1 1 0 0 0

    public static void main(String[] args) {

        int[][] arrayOne = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arrayTwo = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int[][] arrayRezult = new int[arrayOne.length][arrayTwo[0].length];

        for (int i = 0; i < arrayRezult[0].length; i++) {
            for (int j = 0; j < arrayRezult.length; j++) {
                for (int k = 0; k < arrayOne[0].length; k++) {
                    arrayRezult[i][j] = arrayRezult[i][j] + arrayOne[i][k] * arrayTwo[k][j];
                }
                System.out.print(" " + arrayRezult[i][j] + " ");
            }
        }
    }
}
