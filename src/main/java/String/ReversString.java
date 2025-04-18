package String;

import java.util.Scanner;

public class ReversString {//Развернуть строку
    public static void main(String[] args) {
        System.out.println(reverseMetod("abracadabra"));
        System.out.println(reverseMethod2("abracadabra"));
        System.out.println(reverseMethod3("Hello world"));
    }
    private static String reverseMetod(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }return sb.toString();
    }
    private static char[] reverseMethod2(String str) {
        char[] chars = str.toCharArray();
        int temp1 = 0;
        int temp2 = chars.length - 1;
        char element;
        for (; temp1 < temp2; temp1++, temp2--) {
            element = chars[temp1];
            chars[temp1] = chars[temp2];
            chars[temp2] = element;
        }return chars;
    }

    private static char[] reverseMethod3(String srt) {
        char[] chars = srt.toCharArray();

        int i = 0, j = srt.length() - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return chars;
    }
}
class RazvorotScaner {
    public static void main(String[] args) {// Развернуть строку которая напечатана через сканер с помощью цикла for
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String myString = scanner.nextLine();
            scanner.close();
            StringBuilder reverse = new StringBuilder();
            int stringLength = myString.length();
            for (int i = stringLength - 1; i >= 0; i--) {
                reverse.append(myString.charAt(i));}
            System.out.println(reverse);}}}

class RevertStringBuilder{// разворот stringbuilder reverse и удалить гласные и в верхнем регистре
    public static void main(String[] args) {
        String string = "Hello World";
        System.out.println(convertString(string));}
    public static String convertString(String string) {
        return new StringBuilder(string.toUpperCase().replaceAll("[AEIOU]", ""))
                .reverse().toString();}}
