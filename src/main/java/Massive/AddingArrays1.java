package Massive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddingArrays1 { // Дано 2 массива на входе в метод. Метод должен объединить в один и отсортировать
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] result = mergeArray(array1, array2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] mergeArray(int[] array1, int[] array2) {
        int[] mergeArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergeArray, 0, array1.length); // Копируем array1 в mergeArray начиная с индекса 0
        System.arraycopy(array2, 0, mergeArray, array1.length, array2.length);// Копируем array2 начиная с индекса array1.length
        Arrays.sort(mergeArray);// Сортируем объединенный массив
        return mergeArray; // Возвращаем отсортированный массив
    }}

class AddingArrays3 { //найти 2-е максимальное число в массиве
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 48, 51, 12, 19};
        System.out.println(myMethod(arr));
    }
    private static Integer myMethod(Integer[] num) {
        Arrays.sort(num, Collections.reverseOrder());
        return num[1];
    }}

class AddingArrays4 { // Программа, которая считает сумму чисел больше 5 в массиве
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 7, 4, 9};
        System.out.println(myMethod(nums));
        System.out.println(myMethod2(nums));
    }
    private static int myMethod(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 5) {
                sum += i;
            }
        }
        return sum;}

    private static int myMethod2(int[] arr) {
        return Arrays.stream(arr)
                .filter(num -> num > 5)
                .sum();}}

class AddingArrays5 { //Дан массив чисел от 1 до n, в котором отсутствует одно число. Найдите его.
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int num = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                num++;
            } else break;        }
        System.out.println(num); }}

class AddingArrays6 {/* 1 задача: Дан массив целых чисел [1, 2, 3, 4, 5]. Необходимо определить, содержатся ли в массиве
три последовательных числа, идущих по порядку. Последовательность может быть только возрастающей (например, 1, 2, 3).
Если такие числа найдены, вернуть true, иначе вернуть false. Решить используя count*/
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 5, 8, 6};
        System.out.println(myMethod(num));
    }
    private static boolean myMethod(int[] arr) {
        int count = 1;//устанавливаем счетчик
        for (int i = 1; i < arr.length; i++) {//заводим цикл со 2 позиции в массиве
            if (arr[i] == arr[i - 1] + 1) {//проверяем если текущий элемент равен предыдущему +1
                count++;// то увеличиваем счетчик
                if (count == 3) {//если =3 то возвращает true
                    return true;
                }
            } else {
                count = 1; // сбрасываем только если последовательность нарушена
            }
        }
        return false;}
/*        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] + 1 == arr[i] && arr[i] +1 == arr[i +1]){
                return true;
            }
        }
        return false; }*/
    }


    class SplitEvenOdd { // На вход одна строка с числами, в результате должно получится
        public static void main(String[] args) {//1 массив с четными числами, а 2 с нечетными
            int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            List<Integer> evenList = new ArrayList<>();
            List<Integer> oddList = new ArrayList<>();
            for (int n : num) {
                if (n % 2 == 0) {
                    evenList.add(n);
                } else {
                    oddList.add(n);}}
            // Преобразуем обратно в массивы (если нужно)
            int[] evenArray = evenList.stream().mapToInt(Integer::intValue).toArray();
            int[] oddArray = oddList.stream().mapToInt(Integer::intValue).toArray();
            System.out.println("Чётные числа: " + Arrays.toString(evenArray));
            System.out.println("Нечётные числа: " + Arrays.toString(oddArray));
        }}

    class AddingArrays7 {//найти уникальный элемент в массиве
        public static void main(String[] args) {
            int[] array = {2, 5, 3, 2, 3, 4, 6, 7, 5, 4, 8, -1};
            List<Integer> uniqueElements = findUniqueElements(array);

            if (!uniqueElements.isEmpty()) {
                System.out.println("Уникальные элементы в массиве: " + uniqueElements);
            } else {
                System.out.println("В массиве нет уникальных элементов");
            }}
        public static List<Integer> findUniqueElements(int[] array) {
            List<Integer> uniqueElements = new ArrayList<>();
            for (int i = 0; i <= array.length - 1; i++) {
                boolean isu = true;
                for (int j = 0; j <= array.length - 1; j++) {
                    if (i != j && array[i] == array[j]) {
                        isu = false;
                        break;
                    }}
                if (isu) {
                    uniqueElements.add(array[i]);
                }}
            return uniqueElements;}}