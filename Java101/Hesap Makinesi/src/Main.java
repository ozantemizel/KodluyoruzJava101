import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2,select;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz.");
        n1= input.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        n2=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz nedir?");
        select = input.nextInt();

        // If ve else kullarak işlemleri gerçekleştirme
        /*
        if(select==1){
            System.out.println("Toplam: "+(n1+n2));
        } else if(select==2) {
            System.out.println("Çıkarma: "+(n1-n2));
        } else if(select==3){
            System.out.println("Çarpma: "+(n1*n2));
        } else if(select==4) {
            if(n2==0){
                System.out.println("Sayı 0'a bölünemez.");
            }else {
                System.out.println("Bölme: " + (n1 / n2));
            }
        } else {
            System.out.println("Seçiminizi doğru giriniz.");
        }
        */
        // Switch case kullanarak hesaplama;
        switch (select){
            case 1:
                System.out.println("Toplam: "+ (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma: "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma: "+(n1*n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Sayı 0'a bölünemez!");
                     break;
                    default:
                        System.out.println("Bölme: "+(n1/n2));
                }
                break;
            default:
                System.out.println("Yanlış giriş yaptınız.");
        }

    }
}
