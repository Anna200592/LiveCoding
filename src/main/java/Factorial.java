import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int example = scanner.nextInt();
        scanner.close();

        if (example< 0){
            System.out.println("Некорректное число для вывода факториала");
        } else {
            System.out.println(factorial(example));
        }}
    private static long factorial(int number){
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }}