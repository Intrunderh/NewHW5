public class Zadanie3 {
    public static void main(String[] args) {
//        Задача: Найти каждый 2 элемент который больше 5
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 5) {
                continue;
            }
            if (array[i] > 5) {
                i++;
                System.out.println(array[i]);
            }
        }

    }
}
