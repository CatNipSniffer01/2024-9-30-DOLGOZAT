import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Készítette: Czövek Balázs, SZOFT 2/1/N");
        System.out.println("Ez a program kiszámítja a rombusz területét!");
        String Oldal_e;
        String Oldal_f;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Adja meg a rombusz elso atlojat: ");
            Oldal_e = sc.next();
            System.out.print("Adja meg a rombusz masodik atlojat: ");
            Oldal_f = sc.next();
        }
        Double Atlo_e = Double.parseDouble(Oldal_e);
        Double Atlo_f = Double.parseDouble(Oldal_f);
        double Terulet = (Atlo_e*Atlo_f)/2;
        System.out.println("A rombusz terulete a megadott atlokkal: " + Terulet);
    }
}
