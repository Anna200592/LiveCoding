package StrimAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfNumbers { /*Найти сумму нечетных чисел*/
    public static void main(String[] args) {
        int result = Stream.of(1, 2, 3, 4, 5, 11)
                .filter(x -> x % 2 != 0)
                .mapToInt(x -> x)  //или .reduce(Integer::sum)
                .sum();                   //или .orElseThrow(RuntimeException::new);
        System.out.println(result);}}

class Stream1 { // Вывести числа без отрицательных знаков
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(-3);
        num.add(-4);

        List<Integer> result = num.stream()
                .map(Math::abs)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(result);}}

class Stream2 {// Считает количество значений стрима
    public static void main(String[] args) {
        System.out.println(Stream.of(13, 35, 76, 89, 90, 67, 85).count());}}

class Stream3 {// Посчитать сумму ключей и значений, нужно сложить все ключи и все инты во всех списках,
    // а затем сложить сумму // ключей и значений
    public static void main(String[] args) {
        var map = Map.of(
                1, List.of(1, 2, 3, 4, 5),
                2, List.of(1, 2, 3, 4, 5)
        );
        var sum = map.entrySet()
                .stream().mapToInt(x -> x.getKey() + x.getValue()
                        .stream().mapToInt(Integer::intValue)
                        .sum())
                .sum();
        System.out.println(sum);}}

class Stream4 {// Уникальные элементы из списка
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 2, 4, 5);
        List<Integer> list1 = list.stream().distinct().toList();
        System.out.println(list1);
    }}

class Stream5 {//вывести только четные числа
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> evenNumbers = num.stream()
                .filter(e -> e % 2 == 0)
                .toList();
        System.out.println(evenNumbers);}}

class Stream6{//вывести отсортированный список в порядке убывания
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 8, 3, 4, 10, 9, 7);
        List<Integer> evenNumbers = num.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(evenNumbers);
    }}

class Stream7{//есть ли в списке хотябы одно четное число
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 5, 8, 9, 7);
        boolean evenNumbers = num.stream().anyMatch(e -> e % 2 == 0);
        System.out.println(evenNumbers);
    }
}
