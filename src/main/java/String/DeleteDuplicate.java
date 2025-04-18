package String;

public class DeleteDuplicate {
    // TODO: Есть строка "Sssport" надо избавиться от дубликатов и вывести "Sport"
    public static void main(String[] args) {
        String s = "Sssport".toLowerCase(); // Приводим всё к нижнему регистру
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);//если символ не встретился, то добавляем, иначе пропускаем
            }}
        if (result.length() > 0) {// Делаем первую букву заглавной
            result.setCharAt(0, Character.toUpperCase(result.charAt(0)));
        }
        System.out.println(result.toString());}}
