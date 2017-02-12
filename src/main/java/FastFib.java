import java.math.BigInteger;

/**
 * @author kpecmuk
 * @since 12.02.2017
 */
class FastFib {
    private final int number;

    FastFib(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    /**
     * Не рекурсивный метод из книги АЛГОРИТМЫ
     *
     * @param number порядковый номер числа Фибонначи
     * @return результат
     */
    BigInteger calculate(int number) {
        if (number == 0) return BigInteger.ZERO;
        if (number == 1) return BigInteger.ONE;

        BigInteger[] array = new BigInteger[number];
        array[0] = BigInteger.ZERO;
        array[1] = BigInteger.ONE;
        for (int i = 2; i < number; i++) {
            array[i] = array[i - 1].add(array[i - 2]);
        }

        return array[number - 1];
    }
}