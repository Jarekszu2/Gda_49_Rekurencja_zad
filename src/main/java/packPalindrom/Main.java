package packPalindrom;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Buba -> " + czyJestPalindrom("Buba"));
        System.out.println("abuba -> " + czyJestPalindrom("abuba"));
    }

    public static boolean czyJestPalindrom(String tekst) {
        if (tekst.length() <= 1) {
            return true;
        }
        return tekst.charAt(0) == tekst.charAt(tekst.length() - 1) && // ta linia sprawdza czy pierwsza i ostatnia litera wyrazu są takie same
                czyJestPalindrom(tekst.substring(1, tekst.length() - 1)); // później (po porównaniu) wchodzę wgłąb i porównuję substring bez pierwszej i ostatniej liery
    }
}
