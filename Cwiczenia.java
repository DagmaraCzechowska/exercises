package StrWww;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Cwiczenia {
    public static void main(String[] args) {

        int rokUrodzenia = 1995;
        int wiek = metodaZwracaWiek( rokUrodzenia);
        System.out.println(wiek);

        liczenie(4,2);

        boolean b = czyParzysta(5);
        System.out.println("Czy liczba jest parzysts " + b  );

    }
    public static int metodaZwracaWiek(int rokUrodzenia){
        Calendar calendar = Calendar.getInstance();
        int aktualnyRok = calendar.get(Calendar.YEAR);
        return aktualnyRok - rokUrodzenia;

    }
    public static void liczenie(int a, int b){
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));

    }
    public static boolean czyParzysta(int a){
        if (a % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
