import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int dersSayisi=0;
        int totalPuan=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat=input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik=input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce=input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya=input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik=input.nextInt();
        //*********************************************************
        totalPuan = (0<=mat&&mat<=100)? totalPuan+=mat : totalPuan;
        totalPuan = (0<=fizik&&fizik<=100)? totalPuan+=fizik : totalPuan;
        totalPuan = (0<=turkce&&turkce<=100)? totalPuan+=turkce : totalPuan;
        totalPuan = (0<=kimya&&kimya<=100)? totalPuan+=kimya : totalPuan;
        totalPuan = (0<=muzik&&muzik<=100)? totalPuan+=muzik : totalPuan;
        dersSayisi = (0<=mat&&mat<=100)? dersSayisi+=1 : dersSayisi;
        dersSayisi = (0<=fizik&&fizik<=100)? dersSayisi+=1 : dersSayisi;
        dersSayisi = (0<=kimya&&kimya<=100)? dersSayisi+=1 : dersSayisi;
        dersSayisi = (0<=turkce&&turkce<=100)? dersSayisi+=1 : dersSayisi;
        dersSayisi = (0<=muzik&&muzik<=100)? dersSayisi+=1 : dersSayisi;
        //************************************************************
        double average= (totalPuan/dersSayisi);
        System.out.println("Toplam Puanınız: "+totalPuan);
        System.out.println("Ortalamanız: "+average);
        }
    }

