import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armutkg,elmaKg,domatesKg,patlıcanKg,muzKg;
        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11, muzFiyat=0.95, patlıcanFiyat=5;
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç kg armut aldınz?");
        armutkg= input.nextDouble();

        System.out.println("Kaç kg elma aldınz?");
        elmaKg = input.nextDouble();

        System.out.println("Kaç kg domates aldınız?");
        domatesKg = input.nextDouble();

        System.out.println("Kaç kg patlıcan aldınz?");
        patlıcanKg = input.nextDouble();

        System.out.println("Kaç kg muz aldınz?");
        muzKg= input.nextDouble();

        double totalFiyat = (armutkg*armutFiyat)+(elmaKg*elmaFiyat)+(domatesKg*domatesFiyat)+(patlıcanKg*patlıcanFiyat)+(muzKg*muzFiyat);
        System.out.println("Toplam borcunuz: "+totalFiyat);
    }
}
