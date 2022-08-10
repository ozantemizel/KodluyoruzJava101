import java.util.Scanner;

public class Ucgenler {
    public static void main(String[] args) {
        int a,b,c;
        double u,alan;  // u=(a+b+c)/2
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz: ");
        a=input.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        b=input.nextInt();
        System.out.print("Üçümcü kenarı giriniz: ");
        c=input.nextInt();
        // Üçgenin alanı:  Alan*alan=u*(u-a)*(u-b)*(u-c)
        u=(a+b+c)/2;
        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan: "+alan);


    }
}
