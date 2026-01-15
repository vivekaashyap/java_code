
public class _7Pow {

    public static void main(String[] args) {
        double n = 2.0;
        int p = 10;
        double t = power(n, p);
        System.out.print(t);
    }

    public static double power(double x, int pow) {
        double result = 1;
        for (int i = 0; i < pow; i++) {
            result *= x;
        }
        return result;
    }
}
