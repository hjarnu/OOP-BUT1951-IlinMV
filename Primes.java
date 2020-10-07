/**
 Класс Primes выводит все простые числа от 2 до 100
 **/
public class Primes {
    /**
     Метод Main перебирает числа в диапазоне от 2 до 100 влючительно
     и выводит значения, которые метод isPrime определил простыми
     **/
    public static void main(String[] args) {
        String printNumbers = "";
        for (int i = 2; i <= 100; i++) {
            boolean prime = isPrime(i);
            if (prime) {
                printNumbers = printNumbers + i + " ";
            }
        }
        System.out.println("Простые числа: ");
        System.out.println(printNumbers);
    }
    /**
     Метод isPrime определяет, является ли агрумент простым числом или нет
     **/
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}