public class Zadanie1 {
    public static void main(String[] args) {
//        Задача: Посчитать количество четных элементов в массиве.
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
