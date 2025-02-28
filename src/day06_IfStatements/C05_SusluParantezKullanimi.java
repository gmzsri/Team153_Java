package day06_IfStatements;

import java.util.Scanner;

public class C05_SusluParantezKullanimi {

    public static void main(String[] args) {

        // kullanicidan bir pozitif tam sayi alın
        // sayi 3'e bölünüyorsa " sayi 3'un tam katı " yazdırın
        // sayı 5'e tam bölünüyorsa "sayı 5'in katı " yazdıırn

        Scanner scanner = new Scanner(System.in);
        System.out.println("pozitif tam sayı  girin: ");
        int sayi = scanner.nextInt();

        /*
            EGER bir if Statement'da {} kullanılmazsa
            ilk ;'e kadar olan kısmı if body'si kabul eder


            sonuc: eger if body sadece bir satır ise {} suslu parantez kullanmasak da olur
                   ama if body birden fazla satır ise MUTLAKA {} kullanılmalıdır
         */


        if (sayi % 3 == 0 ) System.out.println("3 ile bölünüyor");

        if (sayi % 5 == 0 )  System.out.println("5 ile bölünüyor");


        // sayı 7'ye bölünüyorsa iki farklı sout içinde
        // " 7 ile bölünüyor" " güzel sayı"

        if (sayi % 7 == 0)
            System.out.println("7 ile bölünüyor"); //if body buraya kadar olan kısmı alır
            System.out.println("güzel sayi"); // bu satır if cümlesinden ayrıdır
                                              // HER DURUMDA Calısır


    }
}
