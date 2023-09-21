public class Task4 {
    /*
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null. Реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
     */
    public static void main(String[] args) {
        checkArray(new Integer[]{15, 466, null, null, 47});
    }

    public static void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                throw new NullPointerException(String.format("В ячейке с индексом %s содержится null", i));

            }

        }
        System.out.println("Значение null не обнаружено");
    }
}
