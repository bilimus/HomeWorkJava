/// Задача №6
//
//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести максимальное значение массива.

package HW_5;

public class HW5_6 {
    public static void main(String[] Args){
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = array[0][0];

        for(int i = 0; i < array.length; i ++)
            for(int j = 0; j < array[i].length; j ++)
                if (max < array[i][j])
                    max = array[i][j];

        System.out.println("Max is: " + max);
    }
}
