package Massive;

import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {// Перевернуть массив
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(array)));
    }
    public static int[] reverseArray(int[] array) {
        int[] reversedarr = new int[array.length];
        for (int i = 0; i <= array.length - 1; i++) {
            reversedarr[array.length - 1 - i] = array[i];

        }
        return reversedarr;}}
