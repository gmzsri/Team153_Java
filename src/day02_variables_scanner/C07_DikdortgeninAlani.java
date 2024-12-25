package day02_variables_scanner;

import java.util.Scanner;

public class C07_DikdortgeninAlani {
    public static void main(String[] args) {

        //kullanıoıdan iki kenar uzunluğu al
        //dikdörtgen alanı hesapla

        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci kenar uzunluğunu giriniz: ");
        double kenar1= scan.nextDouble();

        System.out.println("İkinci kenar uzunluğunu giriniz: ");
        double kenar2= scan.nextDouble();

        System.out.println("Dikdortgenin Alanı: "+ (kenar2 * kenar1));
    }
}
