package HW_6;
public class Task5_hard {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
    }
}
