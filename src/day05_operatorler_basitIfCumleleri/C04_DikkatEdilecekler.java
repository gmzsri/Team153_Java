package day05_operatorler_basitIfCumleleri;

import java.util.Scanner;

public class C04_DikkatEdilecekler {
    public static void main(String[] args) {


        //kullanıcıdan bir karakter alın
        //girilen karakter küçük harf ise true, kucuk harf değilse false yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir karakter giriniz: ");
        char chr = scanner.next().charAt(0);

        //istenen islemi 2 turlu yapabiliriz
        // 1. Character wrapper class ile

        System.out.println(Character.isLowerCase(chr));

        // 2. yöntem ASCII table ile karsılastırma operatoru kullanabiliriz
        //istenen durum 2 degerin arası ise AND kullanılır

        System.out.println(chr >= 'a' && chr <= 'z');

        //istenen durum bir aralığın dısında kalan kısım ise OR kullanılır


        //girilen harf buyuk harf değilse true
        //buyuk harf ise false yazdırın

        System.out.println(chr < 'A' || chr > 'Z');

    }
}
