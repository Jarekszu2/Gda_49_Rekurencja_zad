package packOdwracanieListy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        for (Integer integer : integerList) {
            System.out.print(integer + " ");
        }

        System.out.println();
        List<Integer> listaPoZmianie = odwrocElementyListy(integerList);
        for (Integer integer : listaPoZmianie) {
            System.out.print(integer + " ");
        }

    }

    public static List<Integer> odwrocElementyListy(List<Integer> integerList) {
        List<Integer> listResult = new ArrayList<Integer>();

        if (integerList.size() == 1) {
            return integerList;
        }
        int liczbaKtoraZmieniaPozycje = integerList.get(0);
        integerList.remove(0);
        listResult.addAll(odwrocElementyListy(integerList));
        listResult.add(liczbaKtoraZmieniaPozycje);
        return listResult;
    }
}
