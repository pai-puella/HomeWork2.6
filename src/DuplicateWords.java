import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> wordCount = new HashMap<>(); // используем Map для подсчета количества дублей

        for (String word : words) {
            if (wordCount.containsKey(word)) { // если слово уже присутствует в Map
                int count = wordCount.get(word); // получаем текущее количество дублей
                wordCount.put(word, count + 1); // увеличиваем количество дублей на 1
            } else {
                wordCount.put(word, 1); // добавляем новое слово в Map с начальным количеством 1
            }
        }

        for (int count : wordCount.values()) {
            System.out.println(count); // выводим количество дублей для каждого уникального слова в консоль
        }
    }
}

