//   Задача №5
//
//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести сумму элементов массива.

package HW_5;

public class HW5_5 {
    public static void main(String[] Args){
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int[] sums = new int[array.length];
        for(int i =0; i < array.length; i ++){
            for(int j = 0; j < array[i].length; j ++){
                sums[i] += array[i][j];
            }
            System.out.println("sums[" + i + "] = " + sums[i]);
        }
    }
}
