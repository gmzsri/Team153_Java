package day06_IfStatements;

import java.util.Scanner;

public class C06_TumSartlarinOrtakSonucunuBelirleme {
    public static void main(String[] args) {


        //kullanıcıdan iki tam sayı isteyin

        //girilen sayılara göre asagıdaki degerlendirmeleri yazın
        // 1- sayi1 < sayi2 ise "birinci daha küçük"
        // 2- sayi1 pozitif ise "birinci sıfırdan büyük"
        // 3- sayi2 50'den büyük ise "ikinci 50'den büyük
        // 4- sayi2 5 ile bölünebiliyorsa "ikinci sayı 5'in tam katı"
        // 5- eger konsolda yukarıdakilerin hicbiri yazdırılmazsa
        //      "nasıl sayı sectiniz hiçbir sartı saglamıyor" yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("İki tam sayı giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // 1- sayi1 < sayi2 ise "birinci daha küçük"

        if(sayi1 < sayi2){
            System.out.println("birinci sayı daha küçük");
        }


        // 2- sayi1 pozitif ise "birinci sıfırdan büyük"

        if (sayi1 > 0){
            System.out.println("birinci sayı sıfırdan büyük");
        }


        // 3- sayi2 50'den büyük ise "ikinci 50'den büyük

        if (sayi2 > 50){
            System.out.println("ikinci sayı 50'den büyük");

        }


        // 4- sayi2 5 ile bölünebiliyorsa "ikinci sayı 5'in tam katı"

        if (sayi2 % 5 == 0){
            System.out.println("ikinci sayı 5'in tam katı");
        }

        if(!(sayi1 < sayi2) && !(sayi1 > 0) && !(sayi2 > 50) && !(sayi2 % 5 == 0)){
            System.out.println("nasıl bir sayı sectiniz hiçbir satı saglamıyor ");

        }
    }
}
