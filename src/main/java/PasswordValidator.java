import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    /* Разработать класс PasswordValidator для проверки надежности паролей. Класс должен содержать:
    Метод isLengthExceeded(String password) возвращает true, если длина пароля password превышает MAX_LENGTH, и false в противном случае
    Метод containsDigit(String password) возвращает True, если пароль password содержит хотя бы одну цифру, в противном случае false
     */
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        String password1 = "12YTRFGHJIORWSERF";
        String password2 = "1TRFGHJIORWSERF";
        System.out.println(validator.isLengthExceeded(password1));
        System.out.println(validator.containsDigit(password2));
    }

    public static final int MAX_LENGTH = 16;

    public boolean isLengthExceeded(String password) {
        return password.length() > MAX_LENGTH;
    }

    public boolean containsDigit(String password) {
        for (char temp : password.toCharArray()) {
            if (Character.isDigit(temp)) {
                return true;
            }
        }
        return false;
    }
}

class PhoneValidator {
    public static void main(String[] args) {
        String strings = "+7(912)345-67-89";
        System.out.println(isValidate(strings));
    }

    private static boolean isValidate(String str) {
        String regex = "^\\+7\\([0-9]{3}\\)[0-9]{3}-[0-9]{2}-[0-9]{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}