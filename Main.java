import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double Fiyat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Fiyat bilgisi giriniz : ");
        Fiyat = inp.nextDouble();
        System.out.println("KDV'siz Fiyat : " + Fiyat);

        boolean oran = Fiyat > 1000;
        System.out.println(oran ? "KDV Oranı : " + 0.08 : "KDV Oranı : " + 0.18);

        boolean tutar = Fiyat > 1000;
        System.out.println(tutar ? "KDV Tutarı : " + Fiyat*0.08 : "KDV Tutarı : " + Fiyat*0.18);

        boolean karar = Fiyat > 1000;
        System.out.println(karar ? "KDV'li Fiyat : " + (Fiyat + Fiyat*0.08) : "KDV'li Fiyat : " + (Fiyat + Fiyat*0.18));

    }
}
