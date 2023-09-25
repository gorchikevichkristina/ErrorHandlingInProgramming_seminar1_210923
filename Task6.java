/**
 * Обработайте возможные исключительные ситуации. "Битые" значения
 * в исходном массиве считайте нулями. Можно внести в код правки,
 * которые считаете необходимыми
 */
public class Task6 {
    public static void main(String[] args) {
        String[][] ints = new String[][]{ //двумерный массив
                {"1", "0", "1", "1", "1"},
                {"1", "0", "1", "1", "1"},
                {"1", "0", "1", "1"},
                {"1", "0", "1", "1"},
                {"1", "0", "1", "1", "1"},
        };
        System.out.println(sum2d(ints));
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    private static void repairMatrix(String[][] arr) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxLen < arr[i].length) {
                maxLen = arr[i].length;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length < maxLen) {
                for (int j = arr[i].length - 1; j < maxLen; j++) {
                    arr[i][j] = "0";
                }
            }
        }
    }
    private static void repairMatrix(String[][] arr){

    }
}