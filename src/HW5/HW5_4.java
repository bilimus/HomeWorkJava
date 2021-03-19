//Задача №4
//
//Дан массив:
//int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//необходимо вывести среднее арифметическое всех значений массива.



package HW5;

public class HW5_4 {
    public static void main(String[] Args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.println("Avg is: " + sum/array.length * 1.0);
    }
}
