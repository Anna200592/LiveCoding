package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidationBrackets { //Валидация скобок
    public static void main(String[] args) {
        System.out.println(validate1("([{}])"));
        System.out.println(validate2("([{}])"));
        System.out.println(validate3("([{}])"));
        System.out.println(validate4("([{}])"));}
    private static boolean validate1(String input) {
        if (input == null) {
            return false;//Проверка на null
        }
        int count1 = 0; //Создаем счетчики
        int count2 = 0;
        int count3 = 0;
        for (char c : input.toCharArray()) {//Привести к массиву, создаем цикл
            if (c == '(') {
                count1++;
            } else if (c == ')') {
                count1--;
            } else if (c == '[') {
                count2++;
            } else if (c == ']') {
                count2--;
            } else if (c == '{') {
                count3++;
            } else if (c == '}') {
                count3--;
            }}
        return count1 == 0 && count2 == 0 && count3 == 0;}

    private static boolean validate2(String input) {
        if (input == null) {
            return false;}
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (char c : input.toCharArray()) {
            switch (c) {
                case '(':
                    count1++;
                    break;
                case ')':
                    count1--;
                    break;
                case '[':
                    count2++;
                    break;
                case ']':
                    count2--;
                    break;
                case '{':
                    count3++;
                    break;
                case '}':
                    count3--;
                    break;
                default:
                    System.out.println("Это не скобка");}}
        return count1 == 0 && count2 == 0 && count3 == 0;}

    private static boolean validate3(String input) {
        if (input == null) {
            return false;}
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (char c : input.toCharArray()) {
            switch (c) {
                case '(' -> count1++;
                case ')' -> count1--;
                case '[' -> count2++;
                case ']' -> count2--;
                case '{' -> count3++;
                case '}' -> count3--;
                default -> System.out.println("Это не скобка");}}
        return count1 == 0 && count2 == 0 && count3 == 0;}

    private static boolean validate4(String str){
        char[] chars = str.toCharArray();//приводим нашу строку к массиву символов
        Map<Character,Character> map = new HashMap<>();//создаем и наполняем мапу значениями
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<>();
        for (Character temp : chars){//Проходим по каждому символу в массиве
            if (map.containsValue(temp)){
                stack.push(temp);//если символ откр скобка - кладем в стек
            } else if (stack.isEmpty()|| stack.pop() != map.get(temp)){
  /*            Если стек пуст — значит, нет открывающей скобки под эту закрывающую → ошибка
                Если в стеке есть скобка, но она не соответствует текущей закрывающей — тоже ошибка*/
                return false;}}
        return stack.isEmpty();}}
