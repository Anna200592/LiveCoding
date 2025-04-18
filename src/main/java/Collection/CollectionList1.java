package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionList1 { // найти максимальное и минимальное число
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int max = list.get(0);
        int min = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Максимальное число: " + max + ", Минимальное число: " + min);
    }
}

class CollectionList2 { // Метод для фильтрации фамилий, начинающихся на букву "А"
    public static void main(String[] args) {
        List<String> surname = new ArrayList<>(List.of("Аведов", "Антоненко", "Гусев", "Павлов"));
        System.out.println(getNamesStartingWithA(surname));
    }

    private static List<String> getNamesStartingWithA(List<String> names) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("А")) {
                result.add(name);
            }
        }
        return result;
    }
}

class CollectionList3 { // Создать коллекцию целых чисел, написать программу:
    //  Которая четные числа умножает на 100, а от нечетных отнимает 100 и возвращает коллекцию.
//  Количество принимаемых и возвращаемых элементов коллекций должно совпадать//тернарник это- ?
    public static void main(String[] args) {
        List<Integer> firstlist = List.of(10, 15, 20, 5);
        List<Integer> secondlist = firstlist.stream()
                .map(x -> x % 2 == 0 ? x * 100 : x - 100)
                .toList();
        System.out.println(firstlist);
        System.out.println(secondlist);
    }
}

class CollectionList4 { /*    Напишите программу, которая из списка строк выбирает только те, которые:
    1.	Длиной больше 3 символов.
	2.	Начинаются с буквы “J”.
    3.	Преобразует все выбранные строки в заглавный регистр.*/
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Java", "hello", "Jungle", "world", "JavaScript", "J", "john"));
        System.out.println(changeString(list));
    }
    private static List<String> changeString(List<String> list) {
    return list.stream()
            .filter(s -> s.length() > 3)
            .filter(s -> s.startsWith("J"))
            .map(String::toUpperCase)
            .toList();
    }
}