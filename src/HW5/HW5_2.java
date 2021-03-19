// Задача №2
//
//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести максимальное значение массива.

package HW5;
public class HW5_2 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        System.out.println("Max is: " + max);
    }
}
