import java.util.Arrays;

public class Fibonacci {
    //Вычислить первых 7 чисел Фибоначчи и сумму этих чисел. Сумму с помощью Stream
    public static void main(String[] args) {
        int size = 7;
        int[] arr = new int[size];

        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i -2] + arr[i -1];
        }
        System.out.println(Arrays.toString(arr));
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
