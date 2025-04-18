package Collection;

import java.util.HashMap;
import java.util.Map;

class CollectionHashMap {
    //    Реализуй программу, которая поменяет ключи и значения в HashMap местами
//        На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        System.out.println(map);
        Map<String, Integer> secondmap = new HashMap<>();
        for (Map.Entry<Integer, String> num : map.entrySet()) {
            secondmap.put(num.getValue(), num.getKey());
        }
        System.out.println(secondmap);
    }
/*    через стримы:
    Map<Integer, String> map = new HashMap<>();
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
    Map<String, Integer> secondMap = map.entrySet().stream()
            .collect(
                    Collectors.toMap(
                            Map.Entry::getValue,
                            Map.Entry::getKey
                    )
            );
        System.out.println(map);
        System.out.println(secondMap);*/
}

class RegulHashMap {
    // Проверить соответствуют ли элементы массива шаблону email-a с помощью регулярных выражений
    public static void main(String[] args) {
        String[] emailsList = {"test@mail.ru", "123-kkdf@gmail.com",
                "123@343.com", "qwerty@.com", "123123@yandex.com",
                "test.test@gmail.com", "sdfsdfs@gmail."};
        System.out.println(isValidate(emailsList));
    }

    private static HashMap<String, Boolean> isValidate(String[] email) {
        HashMap<String, Boolean> map = new HashMap<>();
        for (String s : email) {
            boolean validate = s.matches("^[a-zA-Z0-9._-]+@[a-z]+\\.[a-z]{2,}$"); //метод matches() проверяет,
            // соответствует ли строка заданному регулярному выражению (regex).
            map.put(s, validate);
        }
        return map;
    }
}

class CollectionHashMap1 {
    public static void main(String[] args) {
        String input = "Hello world! This is a test. Hello world!";
        // Убираем знаки препинания и приводим к нижнему регистру
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        String[] words = cleanedInput.split("\\s+"); // Разделяем строку на слова

        HashMap<String, Integer> wordCountMap = new HashMap<>();// Создаем HashMap для хранения слов и их количеств
        for (String word : words) {      // Считаем количество слов
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        for (String word : wordCountMap.keySet()) {    // Вывод результатов
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
