import java.util.Scanner;

public class TaksimetreUygulamasi {
    public static void main(String[] args) {
        int km;
        double perKm=2.20, total, startPrice=10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz.");
        km = input.nextInt();

        total = (perKm*km);
        total+=startPrice;

        total = (total<20)? 20 : total;
        System.out.print("Total ücret: "+total);

    }
}
