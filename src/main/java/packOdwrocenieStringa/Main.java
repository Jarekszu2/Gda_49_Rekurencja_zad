package packOdwrocenieStringa;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        String buba = "Buba";
        System.out.println(buba);
        System.out.println();
        System.out.println(rekurencyjnieOdwrocString(buba));

        System.out.println();
        char znak = 'a';
        buba += znak;
        System.out.println(buba);
    }

    // odwrócenie Stringa (reverse)
    public static String rekurencyjnieOdwrocString(String tekst) {
        if (tekst.length() == 1) {
            return tekst;
        }
        char literkaTejIteracji = tekst.charAt(0);

        return rekurencyjnieOdwrocString(tekst.substring(1)) + literkaTejIteracji;
    }
}
