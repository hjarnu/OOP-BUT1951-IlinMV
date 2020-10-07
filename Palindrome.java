/**
 Класс Palindrome принимает данные из командной строки, переворачивает их и проверяет, является ли каждое слово палиндромом
 **/
public class Palindrome {
    /**
     Метод Main считывает входные данные из cmd в строку и выводит результат выполнения reverseString и isPalindrome
     **/
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++){
            String inputString = args[i];
            System.out.println(reverseString(inputString));
            System.out.println(isPalindrome(inputString));
        }
    }
    /**
     Метод reverseString меняет местами символы в строке
     **/
    public static String reverseString(String inputString) {
        int stringLength = inputString.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = inputString.charAt(i) + result;
        }
        return result;
    }

    /**
     Метод isPalindrome сравнивает результат reverseString с первоначальными данными
     **/
    public static boolean isPalindrome(String inputString){
        return inputString.equals(reverseString(inputString));
    }
}