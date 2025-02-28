package day06_IfStatements;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {
    public static void main(String[] args) {


        //kullanıcıdan bir sayı isteyin
        // sayıyı kontrol edip 5 ile bölünebiliyorsa " Sayi 5'in tam katı" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        double sayi = scanner.nextDouble();

        if(sayi % 5 == 0){
            System.out.println("Sayı 5'in tam katı");
        }
    }
}
