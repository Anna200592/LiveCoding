package String;

import java.util.HashMap;
import java.util.Map;

public class Counter { // Посчитать количество букв
    public static void main(String[] args) {
        System.out.println(countMethod("Аллигатор", 'а'));
        System.out.println(countMethod2("Аллигатор", 'а'));
        System.out.println(countMethod3("Работать нужно не 12 часов, а головой", 'в'));
    }
    private static int countMethod(String str, char ch) {
        int count = 0; //иницилизируем счетчик
        str = str.toLowerCase(); //приводим к нижнему регистру
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }}
        return count;}

    private static int countMethod2(String str, char ch) {
        int count = 0; //иницилизируем счетчик
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(ch)) {
                count++;}}
        return count;}

    private static int countMethod3(String str, char ch) {
        int count = 0;
        for (char a : str.toLowerCase().toCharArray()) {
            if (a == Character.toLowerCase(ch)) {
                count++;}}
        return count;}}

class Counter2 {//посчитать сколько раз встречается буква в, через метод Split
    public static void main(String[] args) {
        String str = "Работать нужно не 12 часов, а головой";
        String[] strings = str.split("в");
        System.out.println("С помощью метода split данный символ встречается: " + (strings.length - 1));}}

class Counter3 { //посчитать сколько раз встречается буква o
    public static void main(String[] args) {
        String str = "Работать нужно не 12 часов, а головой";
        long count = str.chars().filter(x -> x == 'о').count();
        System.out.println("данный символ встречается: " + count);}}

class Counter4{ //    Написать метод, который выводит количество
    public static void main(String[] args) {// слов one в любом регистре
        String str = "One tWo threE onE FouR oNe";
        int count = countOneWords(str);
        System.out.println("Количество слов 'one': " + count);}
    public static int countOneWords(String str) {
        int count = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.equalsIgnoreCase("one")) {
                count++;
            }}
        return count;}}

class Counter5{//Посчитать количество конкретных слов в строке используя HashMap
    public static void main(String[] args) {
        String st = "Упади семь раз и восемь раз поднимись";
        String[] mas = st.split(" ");
        HashMap<String, Integer> mapa = new HashMap<>();
        for (int i=0; i<=mas.length-1; i++){
            if (mapa.containsKey(mas[i])) {
                mapa.compute(mas[i], (key,count) -> count+1);}
            else{
                mapa.put(mas[i],1);}}
        System.out.println(mapa);}}

class Counter6{//Создать строку "Hello world!" и вывести символы
    public static void main(String[] args) {//и их количество в ней
        String str ="Hello world";
        char[] chars =str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(Character s :chars){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            } else {
                map.put(s,1);}}
        System.out.println(map);}}