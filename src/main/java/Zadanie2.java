public class Zadanie2 {
    public static void main(String[] args) {
        // Задача: Найти сумму элементов массива
        int[] array = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

    }
}
