/**
 * @author kpecmuk
 * @since 12.02.2017
 */
public class Main {

    private static final int NUMBER = 46;

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        System.out.println("Start..." + (0L) + " ms");

        SlowFib slowFib = new SlowFib(NUMBER);
        System.out.println("Fibon " + NUMBER + " = " + slowFib.calculate(slowFib.getNumber()));

        final long middleTime = System.currentTimeMillis();
        System.out.println("Middle time: " + (middleTime - startTime) + " ms for slowFib");

        FastFib fastFib = new FastFib(NUMBER);
        System.out.println("Fibon " + NUMBER + " = " + fastFib.calculate(fastFib.getNumber()));

        final long endTime = System.currentTimeMillis();

        System.out.println("End..." + (endTime - middleTime) + " ms for fastFib");
    }
}