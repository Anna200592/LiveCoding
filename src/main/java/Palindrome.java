public class Palindrome {
    public static void main(String[] args) {// Является ли строка палиндромом
        String str = "A man a plan a canal Panama";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {// Очистка строки и приведение к нижнему регистру
        char[] chars = str.replaceAll(" ", "").toLowerCase().toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {// Сравнение символов
            if (chars[left] != chars[right]) {
                return false;// Если символы не совпадают, строка не палиндром
            }
            left++;
            right--;
        }
        return true; // Если все символы совпадают, строка палиндром
    }
}
class Palindrome2{
    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String text) {
        return text.replaceAll("[^a-zA-Z0-9]", "")
                .equalsIgnoreCase(new StringBuffer(text.replaceAll("[^a-zA-Z0-9]", "")).reverse().toString());
    }
}