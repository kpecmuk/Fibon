/**
 * @author kpecmuk
 * @since 12.02.2017
 */
public class Main {

    private static final int NUMBER = 46;

    public static void main(String[] args) {
        System.out.println("Start...");

        SlowFib slowFib = new SlowFib(NUMBER);
        System.out.println("Fibon " + NUMBER + " = " + slowFib.calculate(slowFib.getNumber()));

        FastFib fastFib = new FastFib(NUMBER);
        System.out.println("Fibon " + NUMBER + " = " + fastFib.calculate(fastFib.getNumber()));

        System.out.println("End...");
    }
}