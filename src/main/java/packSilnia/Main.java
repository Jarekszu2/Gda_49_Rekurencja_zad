package packSilnia;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println(rekurencyjnieSilnia(3));
    }

    // n! = [n] * [n-1] * [n-2] * ... * [2] * [1]
    public static int rekurencyjnieSilnia(int n) {
        if (n == 1) {
            return  1;
        }
        // mnożę siebie razy element niżej (który otrzymałem z poprzedniego zagłębienia)
        return rekurencyjnieSilnia(n -1) * n;
    }
}
