import java.util.Scanner;

public class DaireAlanveCevre {
    public static void main(String[] args) {
        /**
         * @author O. Temizel
         * */
        int r;
        double pi=3.14, alan, cevre;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r=input.nextInt();

        alan= pi*r*r;
        cevre=2*pi*r;

        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: "+cevre);

        // Merkez açısının ölçüsü a olan daire diliminin alanı için;
        System.out.println("Daire diliminin merkez açısını giriniz: ");
        int a=input.nextInt();
        double aAlan = (alan*a)/360;
        System.out.println("Daire diliminin alanı: "+aAlan);
    }
}
