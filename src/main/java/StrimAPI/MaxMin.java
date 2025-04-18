package StrimAPI;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MaxMin {
    public static void main(String[] args) {
        Supplier<Stream<Integer>> result = () -> Stream.of(1, 2, 4, 6, 8);
        Optional<Integer> min = result.get().min(Comparator.naturalOrder());
        Optional<Integer> max = result.get().max(Comparator.naturalOrder());

        System.out.println(min);
        System.out.println(max);}}

class MaxMin1 {//найти макс и мин через стримы
    public static void main(String[] args) {
        int[] arr = {1, 2, 31, -4, 4, 6};
        System.out.println(Arrays.toString(minAndMax(arr)));
    }
    static int[] minAndMax(int[] arr) {
        int min = Arrays.stream(arr).reduce(0, Integer::min);
        int max = Arrays.stream(arr).reduce(0, Integer::max);
        return new int[]{min, max};
    }}
