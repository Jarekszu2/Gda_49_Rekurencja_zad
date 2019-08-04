package packZamianaLiczbyDziesietnejNaBinarna;
/*
żeby zamienić liczbę dziesiętną na jej reprezentację binarną - dzielimy liczbę przez 2,
resztę z dzielenia zapisujemy (0 lub 1), wynik ponownie dzielimy przez dw i ponownie tak samo zapisujemy
wynik; powtarzamy proces dopóki wynik nie będzie równy 1 i zapisujemy w odwrotnej kolejności;
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        // rozwiązanie iteracyjne
        int liczba = 10; // np.
        StringBuilder bilder = new StringBuilder();

        while (liczba > 1) {
            int reszta = liczba % 2;
            if (reszta == 1) {
                bilder.append("1");
            } else {
                bilder.append("0");
            }

            liczba = liczba / 2;
        }
        bilder.append("1");

        System.out.println(bilder.reverse().toString());

        System.out.println();
        System.out.println();
        System.out.println(zamienLiczbeDziesietnaNaBinarna(10));
    }

    public static String zamienLiczbeDziesietnaNaBinarna(int liczba) {
        if (liczba == 1) {
            return "1";
        }
        if (liczba == 0) {
            return "0";
        }
        String binaryLiczba = zamienLiczbeDziesietnaNaBinarna(liczba / 2) + String.valueOf(liczba % 2);
        return binaryLiczba;
    }
}
