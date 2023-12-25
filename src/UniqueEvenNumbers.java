import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueEvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> uniqueEvenNumbers = new HashSet<>(); // используем Set для хранения уникальных четных чисел

        for (int num : nums) {
            if (num % 2 == 0) { // проверяем, является ли число четным
                uniqueEvenNumbers.add(num); // добавляем четное число в Set
            }
        }

        List<Integer> sortedUniqueEvenNumbers = new ArrayList<>(uniqueEvenNumbers); // преобразуем Set в List
        sortedUniqueEvenNumbers.sort(Integer::compareTo); // сортируем список по возрастанию

        for (int num : sortedUniqueEvenNumbers) {
            System.out.println(num); // выводим уникальные четные числа в консоль
        }
    }
}

