package String;

public class Replace { //Заменить * на символ а
    public static void main(String[] args) {
        String string = "Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро";
        char oldchar = '*';
        char newchar = 'a';
        String s = replace(string, oldchar, newchar);
        System.out.println(s);
    }
    public static String replace(String string, char oldchar, char newchar) {
        if (string == null) {
            return "false";}
        char[] ch = string.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == oldchar) {
                ch[i] = newchar;}}
        return String.valueOf(ch);}}

class Replace1 {//Заменить * на 4
    public static void main(String[] args) {
        String mystring = "123*";
        char one = '*';
        char two = '4';
        System.out.println(zamena(mystring, one, two));
    }
    public static String zamena(String s, char one, char two) {
        char[] chars = s.toCharArray();
        for (int i = 0; i <= chars.length - 1; i++) {
            char temp = chars[i];
            if (temp == one) {
                chars[i] = two;
            }}return String.valueOf(chars);}}
