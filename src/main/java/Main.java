import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start...");

        int number = 50;
        System.out.println("Fibon " + number + " = " + fib1(number - 1));
        System.out.println("Fibon " + number + " = " + fib2(number));

        System.out.println("End...");
    }

    /**
     * Рекурсивный метод (долгий).
     * @param number порядковый номер числа Фибонначи
     * @return результат
     */
    private static BigInteger fib1(int number) {
        if (number == 0) return (BigInteger.ZERO);
        if (number == 1) return (BigInteger.ONE);

        BigInteger result = fib1(number - 1).add(fib1(number - 2));

        return result;
    }

    /**
     * Не рекурсивный метод из книги (быстрый)
     */
    private static long fib2(int number) {
        if (number < 2) return number;
        long[] array = new long[number + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < number; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array[number - 1];
    }
}