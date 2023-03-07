import InneKlasy.Kwiaciarnia;
import InneKlasy.Sklep;

public class Main {
    public static void main(String[] args) {
        Sklep sklep1 = new Sklep("Jana Pawła II 2137", 30,true,3500 );
        Kwiaciarnia kwiat1 = new Kwiaciarnia("WTC 9/11", 40, false, 2500, 15);
        System.out.println(sklep1);
        System.out.println(kwiat1);
        System.out.println("Liczba polek kwiaciarni: " + kwiat1.liczbaPolek());

    }
}