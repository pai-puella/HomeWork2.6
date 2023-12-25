import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "grape"));

        Set<String> uniqueWords = new HashSet<>(words);

        for (String word : uniqueWords) {
            System.out.println(word); // выводим уникальные слова в консоль
        }
    }
}
