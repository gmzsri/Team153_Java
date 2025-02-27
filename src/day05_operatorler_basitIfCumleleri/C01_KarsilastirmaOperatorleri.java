package day05_operatorler_basitIfCumleleri;

import java.util.Scanner;

public class C01_KarsilastirmaOperatorleri {
    public static void main(String[] args) {


        //kullanıcıdan tam sayı iste
        //girilen tam sayı cift ise true, cift değilse false yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("LUTFEN BİR TAM SAYI GİRİNİZ : ");
        int sayi = scanner.nextInt();

        System.out.println(sayi % 2 == 0);

        //girilen sayı 23!un katı ıse true, katı değilse false yazdırın

        System.out.println(sayi % 23 == 0);



    }
}
