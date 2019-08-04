package packPotega;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println(rekurencyjniePotega(2, 5));
    }

    // n^m = n * n * n * ... * n (m krotność mnożenia przez siebie n)
    public static long rekurencyjniePotega(int n, int m) {
        if (m == 1) {
            return n;
        }
        return rekurencyjniePotega(n, m - 1) * n;
    }
}
