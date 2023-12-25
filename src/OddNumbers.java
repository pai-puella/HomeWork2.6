import java.util.ArrayList;
import java.util.List;

public class OddNumbers {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (int num : nums) {
            if (num % 2 != 0) { // проверяем, является ли число нечетным
                System.out.println(num); // выводим нечетное число в консоль
            }
        }
    }
}