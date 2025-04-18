public class Armstrong {// Написать программу, на проверку является ли число числом Армстронга
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int result = 0;
        int countNumber = String.valueOf(num).length(); //Определяем количество цифр
        while (num > 0) {// Вычисляем сумму цифр, возведённых в степень digits
            int digit = num % 10;
            result += Math.pow(digit, countNumber);
            num /= 10;}
        if (original == result) // Сравниваем с оригинальным числом
            System.out.println("Является числом Армстронга");
         else
            System.out.println("Не является числом Армстронга");}}