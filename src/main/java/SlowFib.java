import java.math.BigInteger;

/**
 * @author kpecmuk
 * @since 12.02.2017
 */
class SlowFib {
    private final int number;

    SlowFib(int number) {
        this.number = number - 1;
    }

    int getNumber() {
        return number;
    }

    /**
     * Рекурсивный метод (долгий).
     *
     * @param number порядковый номер числа Фибонначи
     * @return результат
     */
    BigInteger calculate(int number) {
        if (number == 0) return BigInteger.ZERO;
        if (number == 1) return BigInteger.ONE;

        return calculate(number - 1).add(calculate(number - 2));
    }
}