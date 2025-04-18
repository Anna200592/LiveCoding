package String;

import java.util.*;

public class Main { //На вход принимает 2 аргумента, нужно вывести в консоль строку и количество
    public static void main(String[] args) {
        System.out.println(repeatString(2, "hello"));
    }
    private static String repeatString(int count, String text) {
        if (count <= 0) {
            return "Количество должно быть больше 0.";}
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text).append("\n");}
        return result.toString();}}

class Main2 { // На вход одна строка с числами, в результате должно получится 1 массив
    public static void main(String[] args) {//с четными числами, а 2 с нечетными
        String num = "1,2,3,4,5,6,7,8,9";
        String[] numbers = num.split(",");// убираем запятые
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        for (String s : numbers) {
            int value = Integer.parseInt(s); //Преобразуем строку в число
            if (value % 2 == 0) {
                evenNumbers.add(value);
            } else {
                oddNumbers.add(value);}}
        System.out.println("Четные числа: " + evenNumbers);
        System.out.println("Не четные числа: " + oddNumbers);}}

class Main3 { /*Написать метод, который принимает на вход строку и ищет в ней самую длинную подстроку,состоящую из
одинаковых символов. Если таких подстрок несколько, то искомая подстрока самая левая. Метод возвращает найденную подстроку*/
    public static void main(String[] args) {
        String str = "11177000000000009";
        StringBuilder max = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        char[] s = str.toCharArray();
        char symbol = s[0];
        for (int i = 0; i < str.length(); i++) {
            if (symbol == s[i]) {
                temp.append(symbol);
            } else {
                symbol = s[i];
                temp = new StringBuilder();
                temp.append(symbol);
            }
            if (temp.length() > max.length()) {
                max = temp;}}
        System.out.println(max);}}

class Main4 { // Убрать восклицательный знак в строке "Нужно работать не 12 часов, а головой!"
    public static void main(String[] args) {
        String str = "Нужно работать не 12 часов, а головой!";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '!') {
                chars[i] = ' ';
            }
        }
        String result = String.copyValueOf(chars);
        System.out.println(result);}}

class Main5 {//Напиши программу, которая принимает строку с текстом, удаляет дубликаты слов и выводит их в алфавитном порядке.
    // Слова должны содержать только буквы и цифры (без пунктуации).
    public static void main(String[] args) {
        String string = "Java is great! Java is powerful. Java, Python, and C++ are languages.";
        //Приводим к нижнему регистру и удаляем всё, кроме букв, цифр и пробелов
        string = string.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");
        String[] word = string.split(" ");// делим на слова
        Set<String> set = new TreeSet<>(Arrays.asList(word)); // Используем Set для удаления дубликатов и TreeSet для сортировки
        set.toString();
        System.out.println(set);
/*        List<String> result = Arrays.stream(string.toLowerCase()//приводим к нижнему регистру
                .replaceAll("[^a-zA-Z0-9 ]", "") //удаляем пунктуацию
                .split(" "))// разделяем на слова
                .distinct()// удаляем дубликаты
                .sorted()//сортируем
                .toList();// собираем в лист
        System.out.println(result);*/}}






