package String;

public class RemoveSpaces { // Удалить лишние пробелы
    public static void main(String[] args) {
        String string = " I hate     java     sometimes!   ";
        String trimmedString = string.trim(); // Удаляем начальные
        StringBuffer strbuf = new StringBuffer();//и конечные пробелы
        boolean spaces = false;
        for (char c : trimmedString.toCharArray()) {
            if (c != ' ') {
                strbuf.append(c);
                spaces = false; // Сбрасываем флаг, когда найден
            } else if (!spaces) {//не пробельный символ
                strbuf.append(c); // Добавляем один пробел, если последний символ не был пробелом
                spaces = true; // Устанавливаем флаг в true
            }}
        System.out.println(strbuf);}}
