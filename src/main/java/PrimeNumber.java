import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp, number;
        boolean isP = true;
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        for (int i = 2; i <= number / 2; i++) {
            temp = number % i;
            if (temp == 0) {
                isP = false;
            }
        }
        if (isP) {
            System.out.println("простое число");
        } else System.out.println("не простое число");}}
