package day04_matematikselislemler_Increment;

import java.util.Scanner;

public class C01_Modulus {
    public static void main(String[] args) {


        //kullanıcıdan bir sayı alıp çift olup olmadığını bul

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz: ");

        int sayi = scanner.nextInt();


        System.out.println(sayi % 2);

        // girilen sayının birler basamagını yazın

        System.out.println("Girilen sayının birler basamağı:" + sayi % 10);

        // girilen sayının 29'un katı olup olmadığını kontrol et

        System.out.println("29 ile bölümünden kalan : "+ sayi % 29);


    }
}
