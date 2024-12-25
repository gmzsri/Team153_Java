package day02_variables_scanner;

import java.util.Scanner;

public class C06_KullaniciBilgileriniYazdirma {
    public static void main(String[] args) {

        //kullanıcıdan isim, soyisim ve yas bilgiisni alıp yazdır

        Scanner scan = new Scanner(System.in);

        System.out.println("İsminizi giriniz: ");
        String isim = scan.nextLine();

        System.out.println("Soyisminizi giriniz: ");
        String soyisim = scan.nextLine();

        System.out.println("Yaşınızı giriniz: ");
        byte yas= scan.nextByte();

        System.out.println("İsminiz: "+ isim);
        System.out.println("Soyisminiz: "+ soyisim);
        System.out.println("Yasiniz: "+yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir");

    }
}
