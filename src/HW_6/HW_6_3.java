//   Задача №3
//
//Дана строка:
//String s = “Посмотрите как Рите нравится ритм”;
//необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//Для указанной строки ответ будет 6, 15, 29.

package HW_6;

public class HW_6_3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        int count = 0;
        s = s.toLowerCase();
        int index = s.indexOf("рит");
        while(index != -1){
            System.out.println(index);
            index = s.indexOf("рит", ++index);
        }

    }
}
