import java.util.*;
import java.util.stream.Collectors;

public class Task02 {
    public static void main(String[] args) {
        Map<String, String> name = new HashMap<>();
        name.put("Иванов", "Иван"); name.put("Петрова", "Светлана"); name.put("Белова", "Кристина");
        name.put("Мусина", "Анна"); name.put("Крутова", "Анна"); name.put("Юрин", "Иван");
        name.put("Лыков", "Пётр"); name.put("Чернов", "Павел"); name.put("Чернышов", "Пётр");
        name.put("Фёдорова", "Мария"); name.put("Светлова", "Марина"); name.put("Савина", "Мария");
        name.put("Рыкова", "Мария"); name.put("Лугова", "Марина"); name.put("Владимирова", "Анна");
        name.put("Мечников", "Иван"); name.put("Петин", "Пётр"); name.put("Ежов", "Иван");
        System.out.println(name);
        sortName(name);

    }
    public static void sortName(Map name){
        Map<String, Integer> sortArray = new HashMap<>();
        Iterator count = name.entrySet().iterator();
        while (count.hasNext()) {
            Map.Entry pair = (Map.Entry)count.next();
//            System.out.println(pair.getKey() + " = " + pair.getValue());
            if(sortArray.containsKey(pair.getValue())){
                sortArray.put((String) pair.getValue(), Integer.parseInt(sortArray.get(pair.getValue()).toString())+1);
            }else {
                sortArray.put((String) pair.getValue(), 1);
            }
            count.remove();
        }
        Map<String, Integer> sortedNew = sortArray.entrySet()
                .stream().sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        for (var el: sortedNew.entrySet()) {
            System.out.println(el.getKey() + " = " + el.getValue());
        }
    }
}
