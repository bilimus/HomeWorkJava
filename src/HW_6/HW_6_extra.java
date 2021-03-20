//Экстра задача
//
//        Дан массив:
//        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

package HW_6;

public class HW_6_extra {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
            int count = 0;
            char ch = 'е';

            for (int i =0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    if(array[i][j].indexOf(ch) == -1)
                        count++;
                }
            }
        System.out.println(count);
   }
}
