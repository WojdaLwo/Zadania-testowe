import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 //       System.out.println(wiekszyString ());

        System.out.println(najmniejszy());
        System.out.println(czyRowneInty());
        System.out.println(srednia());
        porzadkowanie();
        System.out.println(potega());
        rysowanieRamki();
        System.out.println(sredniaLiczbWiekszychOd5());
        System.out.println(sumaPrzezTrzy());
        tablicaPieciuIntow();
        System.out.println(tablicaStringow());
        int[] tablica = dwieTablice();
        System.out.println(tablica.length);
        for(int i=0;i<tablica.length;i++){
            System.out.println(tablica[i]);
        }
        System.out.println(sumaIntowTablicy());
        tablicaRazyDwa();
        System.out.println(sumaIntowTablicyDoPewnegoMiejsca());
        czegoWiecej();
        wypiszDluzsze();
        System.out.println(iloczynIntowTablicy());
        konczaceSieNaA();
    }

//    1) Zadeklaruj dwie zmienne typu String i spróbuj je porównać operatorem >. Jaki jest efekt programu?

//    public static boolean wiekszyString (){ // nie działa
//        String string1 = "Drzewo";
//        String string2 = "Ziemia";
//        if (string1>string2){
//            return true;
//        }
//        return false;
//    }

//  2) Napisz program w którym deklarujesz 3 zmienne typu int (różne od siebie) i program wyświetli najmniejszą z nich.

    public static int najmniejszy(){
        int pierwsza = 10;
        int druga = 4;
        int trzecia = 7;
        int najmniejsza;
        najmniejsza=pierwsza;
        if(druga<najmniejsza){
            najmniejsza=druga;
        };
        if(trzecia<najmniejsza){
            najmniejsza=trzecia;
        };
        return najmniejsza;
    };

//  3) Napisz program w którym deklarujesz 2 zmienne typu int. Sprawdź czy są sobie równe

    public static boolean czyRowneInty(){
        int pierwszy = 10;
        int drugi = 10;
        if (pierwszy==drugi){
            return true;
        };
        return false;
    }

    //4) Napisz program który sprawdzi czy średnia dwóch liczb typu double jest większa od 5.

    public static boolean srednia(){
        double a=3.8;
        double b=6.21;
        if((a+b)/2>5) {
            return true;
        }
        return false;
    }

    //5*) Napisz program w którym deklarujesz 3 zmienne typu int (różne od siebie). Program ma wyświetlić je posortowane rosnąco

    public static void porzadkowanie(){ // zakładam, że skoro tablice były następnym tematem na twojej liście, nie powinienem ich tu używać
        int pierwsza=8;
        int druga=0;
        int trzecia=4;
        int pomocnicza;
        if (pierwsza>druga){
            pomocnicza=pierwsza;
            pierwsza=druga;
            druga=pomocnicza;
        }
        if (druga>trzecia){
            pomocnicza=druga;
            druga=trzecia;
            trzecia=pomocnicza;
            if (pierwsza>druga){
                pomocnicza=pierwsza;
                pierwsza=druga;
                druga=pomocnicza;
            }
        }
        System.out.println(pierwsza);
        System.out.println(druga);
        System.out.println(trzecia);
    }

//Zadanie 1.
//Napisz program, który oblicza potęgę 2n, gdzie liczbę naturalną n podaje użytkownik.

    public static int potega(){
        Scanner scanner = new Scanner(System.in);
        int stopien;
        int wynik=1;
        do {
            System.out.println("Podaj potege 2");
            stopien = scanner.nextInt();
        } while (stopien<0);
        for (int i=0;i<stopien;i++){
            wynik=wynik*2;
        }
        return wynik;
    }

//Zadanie 2.
//Napisz program drukujacy na ekranie prostokat z literek X. Wysokosc i szerokosc prostokata wczytujemy z klawiatury.

    public static void rysowanieRamki(){
        Scanner scanner = new Scanner(System.in);
        int szerokosc;
        int wysokosc;
        do {
            System.out.println("Podaj szerokość ramki");
            szerokosc = scanner.nextInt();
        } while (szerokosc<2); // założyłem, że powinno być conajmniej 2x2
        do {
            System.out.println("Podaj wysokosc ramki");
            wysokosc = scanner.nextInt();
        } while (szerokosc<2);
        for(int i=0;i<wysokosc;i++){
            System.out.print("X");
            int j=0;
            while(j<szerokosc-2){
                if(i==0||i==wysokosc-1){
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println("X");
        }
    }

    //Zadanie 3.
    //Napisz program, który oblicza średnią arytmetyczną liczb naturalnych od 5 do liczby podanej przez użytkownika. Wypisać obliczoną średnią na konsoli.

    public static double sredniaLiczbWiekszychOd5(){
        Scanner scanner = new Scanner(System.in);
        int suma=0;
        int ilosc=0;
        int liczba;
        double dsuma;
        double dilosc;
        do {
            System.out.println("Podaj liczbę nie mniejszą niż 5");
            liczba = scanner.nextInt();
        } while (liczba<5);
        for(int i=5;i<=liczba;i++){
            suma+=i;
            ilosc++;
        }
        dsuma=Double.valueOf(suma);
        dilosc=Double.valueOf(ilosc);

        return (dsuma/dilosc);
    }

//    Zadanie 3.
//    Napisz program, który sumuje liczby z zakresu 1-40 ale tylko te które są podzielne przez 3

    public static int sumaPrzezTrzy(){
        int suma=0;
        for(int i=1;i<=40;i++){ // w sumie mógłbym od 0 zacząć
            if(i%3==0){
                suma+=i;
            }

        }
        return suma;
    }

//    Zadanie 4.
//    Zadeklaruj tablicę intów długości 5 i wypełnij ja dowolnymi liczbami.
//    Wyświetl całą tablice w pętli for lub while.

    public static void tablicaPieciuIntow(){
        int[] tablicaIntow = new int[5];
        tablicaIntow[0]=5;
        tablicaIntow[1]=15;
        tablicaIntow[2]=7;
        tablicaIntow[3]=3;
        tablicaIntow[4]=10;
        for(int i=0;i<5;i++){
            System.out.println(tablicaIntow[i]);
        }
        int i=0;
        while(i<5){
            System.out.println(tablicaIntow[i]);
            i++;
        }

    }

//    Zadanie 5.
//    Zadeklaruj tablice stringów dlugosci 4, dodaj do niej 4 wyrazy. W petli przypisz każdy wyraz do wcześniej utworzonej zmiennej typu string. Wyświetl tą zmienną

    public static String tablicaStringow(){
        String[] tablicaZeStringami = new String[4];
        tablicaZeStringami[0] = "pierwszy";
        tablicaZeStringami[1] = "drugi";
        tablicaZeStringami[2] = "trzeci";
        tablicaZeStringami[3] = "czwarty";
        String skladak = "";
        for (int i=0;i<tablicaZeStringami.length;i++){
            skladak+=tablicaZeStringami[i];
            skladak+=" ";
        }
        return skladak;
    }

//    Zadanie 6.
//    Zadeklaruj dwie tablice intów róznej dlugosci. Przypisz obu na indeksie 0 jakas liczbe.
//    Wyswietl tę tablicę która jest dłuższa (oczywiście zmiana długości danej tablicy
//            powinna wpływać na wypisanie tablic)

    public static int[] dwieTablice(){
        int[] dluzszaTablica;
        int[] pierwszaTablica = new int[5];
        int[] drugaTablica = new int[8];
        pierwszaTablica[0]=7;
        drugaTablica[0]=3;
        if(pierwszaTablica.length>drugaTablica.length){
            dluzszaTablica=pierwszaTablica;
        } else{
            dluzszaTablica=drugaTablica;
        }
        return dluzszaTablica;
    }

    //Zadanie 1.
    //Napisz program, który dla danej tablicy intów oblicza sumę elementów tej tablicy

    public static int sumaIntowTablicy(){
        int[] tablicaIntow = new int[5];
        tablicaIntow[0]=5;
        tablicaIntow[1]=15;
        tablicaIntow[2]=7;
        tablicaIntow[3]=3;
        tablicaIntow[4]=10;
        int suma=0;
        for(int i=0;i<5;i++){
            suma+=tablicaIntow[i];
        }
        return suma;
    }

    //Zadanie 2.
    //Napisz program, który dla danej tablicy intów długości 3 wyświetli tablicę 2 razy dłuższą, wypełnioną wartością 0 poza ostatnim elementem, ostatni element tablicy ma mieć wartość odpowiadającą długości tablicy.

    public static void tablicaRazyDwa(){
        int[] tablicaIntow = new int[3];
        tablicaIntow[0]=4;
        tablicaIntow[1]=5;
        tablicaIntow[2]=6;
        int[] dluzszaTablica = new int[(tablicaIntow.length)*2];
        for(int i=0;i<dluzszaTablica.length-1;i++){
            dluzszaTablica[i]=0;
        }
        dluzszaTablica[5]=dluzszaTablica.length;
        for (int i=0;i<dluzszaTablica.length;i++){
            System.out.println(dluzszaTablica[i]);
        }
    }

    //Zadanie 3.
    //Napisz program, który dla danej tablicy intów zwraca sume elementów po lewej od zadanego indeksu. Np. dla danych:

    public static int sumaIntowTablicyDoPewnegoMiejsca(){
        int[] tablicaIntow = new int[5];
        tablicaIntow[0]=5;
        tablicaIntow[1]=15;
        tablicaIntow[2]=7;
        tablicaIntow[3]=3;
        tablicaIntow[4]=10;
        int zadanyIndeks=3;
        int suma=0;
        for(int i=0;i<zadanyIndeks;i++){
            suma+=tablicaIntow[i];
        }
        return suma;
    }

    //1) Dla podanej tablicy intow oblicz czy więcej jest elementów dodatnych czy podzielnych przez 3

    public static void czegoWiecej(){
        int[] tablicaIntow = new int[5];
        tablicaIntow[0]=5;
        tablicaIntow[1]=-15;
        tablicaIntow[2]=-7;
        tablicaIntow[3]=3;
        tablicaIntow[4]=10;
        int iloscDodatnich=0;
        int iloscPodzielnychPrzezTrzy=0;
        for(int i=0;i<tablicaIntow.length;i++){
            if(tablicaIntow[i]>0){
                iloscDodatnich+=1;
            }
            if(tablicaIntow[i]%3==0){
                iloscPodzielnychPrzezTrzy+=1;
            }
        }
        if(iloscDodatnich==iloscPodzielnychPrzezTrzy){
            System.out.println("jest po równo");
        } else if(iloscDodatnich>iloscPodzielnychPrzezTrzy){
            System.out.println("jest więcej dodatnich");
        } else {
            System.out.println("jest więcej podzielnych przez 3");
        }
    }

    //2) Z podanej tablicy Stringów wypisz te których długość jest większ niż 7 (długość Stringa zwróci nam metoda length(), czyli np dla Stringa imie = ”Ania”; imie.length() zwraca 4)

    public static void wypiszDluzsze(){
        String[] tablicaZeStringami = new String[5];
        tablicaZeStringami[0] = "pierwszy";
        tablicaZeStringami[1] = "drugi";
        tablicaZeStringami[2] = "trzeci";
        tablicaZeStringami[3] = "czwartyyy";
        tablicaZeStringami[4] = "piątyyyyyy";
        for(int i=0;i<tablicaZeStringami.length;i++){
            if(tablicaZeStringami[i].length()>7){
                System.out.println(tablicaZeStringami[i]);
            }
        }
    }

    //3) Oblicz iloczyn liczb podanych w tablicy intów

    public static int iloczynIntowTablicy(){
        int[] tablicaIntow = new int[5];
        tablicaIntow[0]=5;
        tablicaIntow[1]=15;
        tablicaIntow[2]=7;
        tablicaIntow[3]=3;
        tablicaIntow[4]=10;
        int iloczyn;
        if(tablicaIntow.length==0){
            iloczyn=0;
        } else{
            iloczyn=1;
        }
        for(int i=0;i<tablicaIntow.length;i++){
            iloczyn=iloczyn*tablicaIntow[i];
        }
        return iloczyn;
    }

    //4) Dla podanej tablicy Stringów, wypisz te, które kończą się na literę ‘a’, (metoda charAt() lub endsWith(), wygoogluj co one robią i jak działają)

    public static void konczaceSieNaA(){
        String[] tablicaZeStringami = new String[5];
        tablicaZeStringami[0] = "pierwszy";
        tablicaZeStringami[1] = "drugi";
        tablicaZeStringami[2] = "trzecia";
        tablicaZeStringami[3] = "czwarty";
        tablicaZeStringami[4] = "piąta";
        for(int i=0;i<tablicaZeStringami.length;i++){
            if(tablicaZeStringami[i].endsWith("a")){
                System.out.println(tablicaZeStringami[i]);
            }
            if(tablicaZeStringami[i].charAt(tablicaZeStringami[i].length()-1)=='a'){
                System.out.println(tablicaZeStringami[i]);
            }
        }
    }
}
