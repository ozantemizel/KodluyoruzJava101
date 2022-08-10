import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
          Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
          Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
          Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        * */
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.println("Hava sıcaklığnı giriş yapınız.");
        heat = input.nextInt();
        if(heat>=25) {
            System.out.println("Yüzmeye gidebilirsiniz ya da evde oturabilirsiniz:)");
        } else if(heat<=5){
            System.out.println("Kayak yapmaya gidebilirsiniz ya da NetflixChill:)");
        } else if(heat>10&&heat<15) {
            System.out.println("Sinemaya ya da Pinkiğe gidebilirsiniz.");
        } else if(heat>5&&heat<10) {
            System.out.println("Sinema güzel tercih olur.");
        } else{
            System.out.println("Pikniğe gidebilirsiniz.");
        }


    }
}
