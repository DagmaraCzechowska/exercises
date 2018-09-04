package StrWww;

public class Tablice {
    public static void main(String[] args) {
        int [] liczby = {1,2,3};
        int [] liczby2 = tablicaPob(liczby);
        for (Integer liczba: liczby2){
            System.out.println(liczba);
        }

    }
    public String [] alfabet(){
        String [] piecLiter={"a","b","c","d","e"};
        return piecLiter;
    }
    public static int [] tablicaPob(int [] tablica){
    int [] zwrot = new int[3];
    zwrot[0] = tablica [2];
    zwrot [1] = tablica [1];
    zwrot [2] = tablica [0];
    return zwrot;
    }
}
