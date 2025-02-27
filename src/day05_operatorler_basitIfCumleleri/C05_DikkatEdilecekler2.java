package day05_operatorler_basitIfCumleleri;

import java.util.Scanner;

public class C05_DikkatEdilecekler2 {
    public static void main(String[] args) {

        //kullanıcıdan bir sayı isteyin
        // kullanıcı 3 basamaklı pozitif bir sayı girerse true
        // 3 basamaklı pozitif bir sayı girmezse false

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir tam asyı giriniz :");
        int sayi = scanner.nextInt();

        System.out.println(sayi>= 100 && sayi <=999);



        //girilen sayı 2 basamaklı pozitif bir tam sayı değilse true
        //2 basamaklı pozitif bir tam sayı ise false


        //System.out.println(!(sayi>=10 && sayi <=99));
        System.out.println(sayi<10 || sayi>=100);

    }
}
