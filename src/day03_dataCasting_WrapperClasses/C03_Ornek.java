package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C03_Ornek {

    public static void main(String[] args) {

        //kullanıcıdan iki tam sayı alıp
        //birinci tam sayıyı ikinci tam sayıya bölün
        //ve sonucu ondalıklı tam sayı olarak yazın


        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci tam sayı değerini girin: ");
        int sayi1= scanner.nextInt();

        System.out.println("İkinci tam sayı değerini girin: ");
        int sayi2= scanner.nextInt();

        System.out.println("İki syının bölüm sonucu: "+ (sayi1 / sayi2)); // 123/10

        //java iki tam sayıyı böldüğünde sadeece tam sayı kısmını yazdırır

        System.out.println("İki syının double bölüm sonucu: "+ (sayi1 / sayi2));

        //java önce bolme işlemini yapıp sonra cast ettiği için 12.0

        System.out.println("sayi 1'i double yapınca double bölüm sonucu: "+ ((double)sayi1 / sayi2));
    }
}
