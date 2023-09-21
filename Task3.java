import java.util.Arrays;
import java.util.List;

public class Task3 {
    /*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
     */
    public static void main(String[] args) {
        int[][] ints = new int[][]{ //двумерный массив
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1}
        };
        System.out.println(getSum(ints));
    }

    public static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static boolean conditionsAreNotCorrect(int[][] matrix) {
        List<Integer> container = List.of(0, 1); //для сокращения кода, что бы не писать лишнее
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                return true;
            }
            for (int j = 0; j < matrix.length; j++) {
                if (!container.contains(matrix[i][j])) {// ! - если не содержит i и j
                    return true;
                }
            }
        }
        return false;
    }

    public static int getSum(int[][] matrix) {
        if (conditionsAreNotCorrect(matrix)) {
            throw new RuntimeException("Error");
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];

            }

        }
        return sum;
    }
}
