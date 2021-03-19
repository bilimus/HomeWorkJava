//     Задача №2
//
//     Дана строка:
//     String s = “Перевыборы выбранного президента”;
//     необходимо подсчитать количество букв “е” в строке.
//     Для указанной строки ответ будет 4.

package HW_6;

public class HW_6_2 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int index = s.indexOf('е');
        int count = 0;
        while(index != -1){
            count ++;
            index = s.indexOf('е', ++index);
        }
        System.out.println(count);

    }
}
