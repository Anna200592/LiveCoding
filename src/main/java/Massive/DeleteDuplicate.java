package Massive;

import java.util.*;

public class DeleteDuplicate { // Дан массив целых чисел, нужно найти все дубликаты и их количество
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 4, 5, 6, 6, 7, 7, 7, 7, 8, 9, 9, 9,};
        Map<Integer, Integer> map = new HashMap();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " шт");
            }
        }}}

class DeleteDuplicate1 { // вывести числа у которых есть дубликаты - {2, 3, 5, 8, 9}
    public static void main(String[] args) {
        int[] sortedList = {1, 2, 2, 3, 3, 4, 5, 5, 5, 5, 6, 7, 8, 8, 9, 9, 10};
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : sortedList) {
            map.put(num, map.getOrDefault(num, 0) + 1);}
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                set.add(entry.getKey());}}
        System.out.println(set);}}

class AddingArrays2 { //Написать программу, которая удаляет дубликаты из массива чисел и заменяет их нижним подчеркиванием,
    // а так же сортирует и выводит количество уникальных чисел в консоль// input: nums ={1,3,2,3}// output: nums = {1,2,3,_}
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3}; //создаем массив
        Set<Integer> set = new TreeSet<>();// создаем ТриСет для того, чтобы отсортировать и удалить дубликаты
        for (int n : nums) {
            set.add(n);}
        List<Integer> list = new ArrayList<>(set);// Переносим set в list, для удобства работы с индексами
        String[] strings = new String[nums.length];// Создаем новый массив длинной как nums, в который поместим list,
        for (int i = 0; i < strings.length; i++) {// а пустые значения заменим на "_"
            if (i < list.size()) {
                strings[i] = String.valueOf(list.get(i));// добавляем число как строку
            } else {
                strings[i] = "_";
            }}System.out.println(Arrays.toString(strings));}}
