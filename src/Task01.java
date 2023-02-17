//Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        Map<Long, String> phoneBook = new HashMap<>();
        int num = Tools.inputint("Сколько номеров добавить? ");
        for (int i = 0; i < num; i++) {
            phoneBook.put(Tools.inputLong("Введите номер: "), Tools.inputStr("Введите имя "));
        }
        for (var elem : phoneBook.entrySet()) {
            System.out.printf("Номер: %d --->  Имя: %s \n", elem.getKey(), elem.getValue());
        }
    }
}