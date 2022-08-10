import java.util.Scanner;

public class KdvTutarHesapla {
    public static void main(String[] args) {
        double tutar,kdvOran;
        Scanner input = new Scanner(System.in);
        System.out.println("Tutarı giriniz!");
        tutar = input.nextDouble();
        // Boolean ile tutarın 1000tl den büyük ya da küçük oluşunu sorgularız.
        boolean girilenTutar = (tutar>=1000);
        kdvOran = (girilenTutar)? 0.08 : 0.18;
        double kdvTutar= tutar*kdvOran;
        double kdvliTutar = tutar+kdvTutar;
        System.out.println("Girdiğiniz Tutar: "+tutar);
        System.out.println("Kdv Oranı: "+kdvOran);
        System.out.println("Kdv tutarı: "+kdvTutar);
        System.out.println("KDVli Tutarı: "+kdvliTutar);
    }

}
