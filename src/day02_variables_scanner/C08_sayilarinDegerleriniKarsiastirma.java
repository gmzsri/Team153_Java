package day02_variables_scanner;

import java.util.Scanner;

public class C08_sayilarinDegerleriniKarsiastirma {
    public static void main(String[] args) {

        //kullanıcıdan iki sayı alıp ikisinin değerlerini değiştirin (swap)

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen birinci sayıyı giriniz");
        int sayi1= scanner.nextInt();

        System.out.println("lütfen ikinci sayıyı giriniz: ");
        int sayi2= scanner.nextInt();

        int temp = 0;

        temp= sayi2;

        sayi2= sayi1 ;

        sayi1=temp;

        System.out.println("son durum sayi1: "+ sayi1 + " son durum sayi2 :"+sayi2);

    }
}
