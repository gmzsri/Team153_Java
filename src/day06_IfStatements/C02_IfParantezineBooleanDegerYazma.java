package day06_IfStatements;

import java.util.Scanner;

public class C02_IfParantezineBooleanDegerYazma {
    public static void main(String[] args) {


        //kullanıcıdan yasını alın
        //65'e esit ya da büyük olduğunu kontrol edin
        //oluşturdugunuz sonuc variable'ına bu sonucu kaydedin
        //sonuc variable'ınaın degeri true ise emekli olabilirsin
        //                            false ise emekli olamazsın  yazdırın


        Scanner scan = new Scanner(System.in);
        System.out.println("yaşınızı girin: ");
        double yas = scan.nextDouble();

        boolean sonuc = yas >= 65 ; //true veya false

        if (sonuc) {
            System.out.println("emekli olabilirsin");

        }

        if (sonuc){
            System.out.println("emekli olamazsın");
        }



    }
}
