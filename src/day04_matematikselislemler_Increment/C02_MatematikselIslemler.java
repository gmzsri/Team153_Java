package day04_matematikselislemler_Increment;

import java.util.Scanner;
import java.util.SortedMap;

public class C02_MatematikselIslemler {
    public static void main(String[] args) {

        int sayi = 423;

        System.out.println(sayi % 10); // 3

        System.out.println(sayi / 10); // 42 ==> 42


        // kullanıcıdan 3 basamaklı poziitf bir tamsayı alın
        // ve sayının rakamlar toplamını bulun

        Scanner scanner = new Scanner(System.in);
        System.out.println("3 basamaklı tam sayı değeri giriniz"); //713
        int girilenSayi = scanner.nextInt();

        int toplam = 0;

        int birlerBasamagi = girilenSayi % 10; //3

        toplam =toplam + birlerBasamagi;

        girilenSayi = girilenSayi / 10; //71

        birlerBasamagi = girilenSayi % 10; //1

        toplam = toplam + birlerBasamagi;

        girilenSayi = girilenSayi /10; //7

        toplam = toplam + girilenSayi ;

        System.out.println("Rakamlar toplamı : " +toplam);






    }
}
