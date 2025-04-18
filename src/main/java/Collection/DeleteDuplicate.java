package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteDuplicate { //программа, которая на вход примет ArrayList строк и удаляет из него все дубликаты,
    public static void main(String[] args) {//не используя метод contains()
        ArrayList<String> arrayList = new ArrayList<>(List.of("дубликаты", "дубликаты", "используя"));
        Set<String> set = new HashSet<>(arrayList);
        System.out.println(set);
    }
}

class Collection2 {/* Избавиться от повторяющихся элементов в строке. Вывести результат на экран */

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 4, 5, 10, 11};//Используем интерфейс Set
        Set<Integer> set = new HashSet<>(List.of(nums));
        System.out.println(set);
    }
}

class DeleteDuplicateContains {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(List.of("Apple", "Banana", "Orange", "Apple", "Banana"));
        System.out.println("Old strings: " + strings);
        List<String> updateStr = myMethod(strings);
        System.out.println("New strings: " + (updateStr));
    }

    private static List<String> myMethod(ArrayList<String> list) {
        List<String> uniqueList = new ArrayList<>();
        for (String str : list) {
            if (!uniqueList.contains(str)) { //Если текущая строка str ещё не содержится в uniqueList, тогда:
                uniqueList.add(str);// добавляем в список
            }
        }
        return uniqueList;
    }
}

class DeleteDuplicate2 {
    public static void main(String[] args) {//удалить дубликаты из сортированного списка с помощью коллекций, стримов
        int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 8, 8, 9, 9, 10};
        System.out.println(sortInt(sortedList));
/*        List<Integer> newList = Stream.of(1,2,2,3,4,4,4,5,5,6,7,8,8,9,9,10) //Стримы
                .distinct()
                .toList();
        System.out.println(newList);*/
    }

    private static Set<Integer> sortInt(int[] nums) {
        Set<Integer> sortNums = new HashSet();
        for (var x : nums) {
            sortNums.add(x);
        }
        return sortNums;
    }
}

