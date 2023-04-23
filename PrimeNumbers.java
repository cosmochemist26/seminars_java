//Вывести все простые числа от 1 до 1000

public class PrimeNumbers {
    public static void main(String args[]) {
        int limit = 1000;
        System.out.println("Prime numbers between 1 and " + limit);
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
 }

