import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("Анаконда", "Канонада"));
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; //Сначала сравнить длину строк, если не совпадают, то вернуть сразу false
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        Map<Character, Integer> map = new HashMap<>(); //Создаем мапу в которую будем записывать key - символ в str1, а
        //value - количество шт встречающиеся в str1
        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(str1.charAt(i))) { //если символ уже есть в мапе,
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1); //то получаем get текущее количество символов и
                // увеличиваем на единицу, и обновляем мапу put
            } else {
                map.put(str1.charAt(i), 1); //иначе добавляем символ и присваиваем единицу
            }}
        for (int j = 0; j < str2.length(); j++) {
            if (map.containsKey(str2.charAt(j))) { // при каждом вхождении символа, вычитаем 1. Должны все символы выйти в 0
                map.put(str2.charAt(j), map.get(str2.charAt(j)) - 1);
            }}
        Set<Character> set = map.keySet();
        for (Character key : set) {
            if (map.get(key) != 0) {
                return false; //Проверка на то, чтобы все символы в str2 были равны 0
            }}
        return true;}}

class Anagrammlegko {
    public static void main(String[] args) {
        // Анаграма
        System.out.println(isAnagram("обезьянсTво", "оветьянсзбо")); // true
        System.out.println(isAnagram("abbc", "abcc")); // false
    }

    public static boolean isAnagram(String real, String anagram) {
        if (real.length() != anagram.length()) {
            return false;
        }
        // Создаем массив для хранения количества вхождений каждого символа в первой строке
        int[] charCounts = new int[256]; // 256 символов ASCII
        // Подсчитываем количество вхождений каждого символа в первой строке
        for (char c : real.toCharArray()) {
            charCounts[c]++;
        }
        // Проверяем, есть ли такое же количество вхождений каждого символа во второй строке
        for (char c : anagram.toCharArray()) {
            charCounts[c]--;
            if (charCounts[c] < 0) {
                return false; // Если количество вхождений во 2 строке больше, чем в 1, то строки не являются анаграммами
            }
        }
        return true; // Если все символы во 2 строке встретились такое же количество раз, как в 1,то строки являются анаграммами
    }
}
