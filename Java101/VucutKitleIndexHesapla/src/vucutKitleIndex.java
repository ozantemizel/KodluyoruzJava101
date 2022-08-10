import java.util.Scanner;

public class vucutKitleIndex {
    public static void main(String[] args) {
        double boy, kilo, vki;
        Scanner input = new Scanner(System.in);
        System.out.println("Boy bilgisini giriniz(metre cinsinden): ");
        boy = input.nextDouble();
        System.out.println("Kilo bilgisini giriniz: ");
        kilo = input.nextDouble();

        vki = kilo/(boy*boy);

        System.out.println("Vücut kitle endeksiniz: "+ vki);

        String str = (vki<25)?"Kilonuz normal" : "Spor salonumuza uğramanızda fayda var";
        System.out.println(str);
    }
}
