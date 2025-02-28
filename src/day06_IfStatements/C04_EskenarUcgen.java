package day06_IfStatements;

import java.util.Scanner;

public class C04_EskenarUcgen {
    public static void main(String[] args) {

        // kullanıcıdan bir ucgenin 3 kenar uzunluğunu alın.
        // ucgen eskenar ise "eskenar ucgen" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarını giriniz: ");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if ( kenar3 == kenar2  && kenar1 == kenar3 && kenar1 >0){
            System.out.println("Eşkenar Üçgen");
        }
    }
}
