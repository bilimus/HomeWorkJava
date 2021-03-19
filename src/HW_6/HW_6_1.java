//    Задача №1
//
//Дана строка:
//String s = “Перестановочный алгоритм быстрого действия”;
//необходимо вывести все буквы “о” из этой строки.
//Для указанной строки ответ будет “ооооо” (или в столбик)
package HW_6;

public class HW_6_1 {
    public static void main(String[] Args){
        String s = "Перестановочный алгоритм быстрого действия";
        char ch = 'о';
        String res = "";
        int index = s.indexOf(ch);
        while(index != -1){
            res += ch;
            index = s.indexOf(ch, index + 1);
        }
        System.out.println("Answer is: " + res);
    }
}
