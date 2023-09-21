public class Task1 {

        /*Реализуйте метод, принимающий в качестве аргументов целочисленный массив и некоторый допустимый минимум.
         Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
         */
        public static void main(String[] args) {
        //System.out.println(checkArrayLength(new int[]{1, 4, 6, 7, 123, 475, -2,}, 5); // с гита скопировать строку
    }
    public static int checkArrayLength(int[] array, int min) {
        if (array.length < min) {
            return -1;
        }
        return array.length;
    }
}