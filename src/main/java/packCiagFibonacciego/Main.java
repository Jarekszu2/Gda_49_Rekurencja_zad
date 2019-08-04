package packCiagFibonacciego;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println(obliczNtyCiagFibonacciego(8));
    }

    public static int obliczNtyCiagFibonacciego(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return obliczNtyCiagFibonacciego(n -1) + obliczNtyCiagFibonacciego(n - 2);
    }
}
