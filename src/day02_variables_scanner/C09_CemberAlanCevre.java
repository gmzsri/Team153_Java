package day02_variables_scanner;

import java.util.Scanner;

public class C09_CemberAlanCevre {
    public static void main(String[] args) {
        // kullanıcıdan yarıcap al ve cemberin alanını ve cevresini bul

        double pi= 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yaricap değeirini giriniz: ");

        double yaricap = scanner.nextDouble();

        double cevre = (2*pi*yaricap);
        System.out.println("Çemberin cevresi: "+ cevre);

        double alan = pi*(yaricap*yaricap);
        System.out.println("Çemberin alanı : "+alan);

    }
}
