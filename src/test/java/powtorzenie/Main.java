package powtorzenie;

public class Main {

    public static void main(String[] args) {


        /*
         * = przypisanie
         * == równa sie
         * != nierówna się
         * >, >=, <, <= wieksze, wieksze badz rowne itd
         * && and (logiczne i, koniunkcja)
         * ||  (logiczne lub, alternatywa)
         * % - modulo, reszta z dzielenia
         */

        // Zadeklaruj 2 zmienne typu int, wyswietl która z tych dwoch liczb jest
        // wieszka i o ile, np dla 4 i 1 chcemy wyswietlic: 4 jest wieksze od 1 o 3

        int a = 3;
        int b = 4;
        if (a > b) {
            System.out.println(a + " jest wieksze od " + b + " o " + (a - b));
        } else {
            System.out.println(b + " jest wieksze od " + a + " o " + (b - a));
        }


        // Napisz program sprawdzajacy czy podana liczba jest parzysta
        int c = 6;
        if (c % 2 == 0) {
            System.out.println("Liczba " + c + " jest parzysta");
        } else {
            System.out.println("Liczba " + c + " nie jest parzysta");
        }

        // Sprawdzmy czy zadeklarowana liczba typu double, nalezy do przedzialu (1,4)
        // czy moze [6,8], czy jest spoza przedzialu
        double d = 3.14;
        if (d > 1 && d < 4) {
            System.out.println("Liczba " + d + " należy do przedziału (1,4)");
        } else if (d >= 6 && d <= 8) {
            System.out.println("Liczba " + d + " należy do przedziału (6,8)");
        } else {
            System.out.println("Liczba " + d + " nie należy do żadnego z podanych przedziałów");
        }


        // zadeklaruj tablice intow na i przypisz do niej 8 liczb


        // wyswietl tylko liczby wieksze niz 4
        // policz sume elementów tablicy
        // znajdz element najwiekszy
        // znajdz element najmniejszy

        int[] tablicaIntow = {5, 1, 8, 3, 0, 6, 4, 7};
        int suma = 0;
        int najwiekszy = Integer.MIN_VALUE\//tablicaIntow[0];
        int najmniejszy = tablicaIntow[0];
        for (int i = 0; i < tablicaIntow.length; i++) {
            if (tablicaIntow[i] > 4) {
                System.out.println(tablicaIntow[i]);
            }
            suma += tablicaIntow[i];
            if (tablicaIntow[i] > najwiekszy) {
                najwiekszy = tablicaIntow[i];
            }
            if (tablicaIntow[i] < najmniejszy) {
                najmniejszy = tablicaIntow[i];
            }

        }


    }
}
