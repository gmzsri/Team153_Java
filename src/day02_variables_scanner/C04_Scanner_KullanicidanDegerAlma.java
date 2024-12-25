package day02_variables_scanner;

import java.util.Scanner;

public class C04_Scanner_KullanicidanDegerAlma {
    public static void main(String[] args) {

        //Kullanıcıdan ismini isteyip
        // girilen ismi büyük harflerle yazdırın

        //1.adım: scanner objesi oluşturma
        Scanner scanner = new Scanner(System.in);



        //2.adım: kullanıcıya ne istediğimizi söyleme
        System.out.println("Lütfen isminizi giriniz....");

        //3.adım: uygun method kullanarak, kullanıcının girdigş degeri alıp
        //          bilginin içeriğine uygun bir variable'a kaydetme

      //  String girilenIsim = scanner.next(); //kullanıcın giridiği ilk metnin ilk space'a kadar olan kısmını alır
                                             // Ali Mert Canli ==> Ali

        String girilenIsim = scanner.nextLine(); // kullanıcının girdiği metnin tamamını alır

        System.out.println("Girilen ismin büyük harflerle yazılmış hali : "+ girilenIsim.toUpperCase());


    }
}
