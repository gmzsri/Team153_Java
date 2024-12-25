package day02_variables_scanner;

import java.util.Scanner;

public class C05_ToplamaCarpma {
    public static void main(String[] args) {

        //kulanıcıdan int ve double data turunde sayı al
        // bunların toplamını ve carpımını bul

        Scanner scanner = new Scanner(System.in);

        System.out.println("İnteger data türünde değer giriniz: ");
        int deger1 = scanner.nextInt();

        System.out.println("Double data turunde deger giriniz: ");
        double deger2 = scanner.nextDouble();

        System.out.println("Sayıların Toplamı : "+ (deger1+deger2));
        System.out.println("Sayıların çarpımı: "+ (deger1 * deger2));







    }
}
