package StrWww;

public class MyNumber {
    int liczba;

    public MyNumber(int liczba) {
        this.liczba = liczba;
    }
    public boolean isOdd(int liczba){
        if (liczba %2!=0){
            return true;
        }else {
            return false;
        }

    }
    public boolean isEven(int liczba){
        if (liczba %2==0){
            return true;
        }else {
            return false;
        }

    }

    public double sqrc(int liczba) {
        double result = Math.sqrt(liczba);
        return result;
    }
}
