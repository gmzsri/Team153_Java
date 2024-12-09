package day01_helloWorld;

public class C02_VariableOlusturma {

    public static void main(String[] args) {

        int sayi = 23;

       //( int sayi = 30; // Variable 'sayi' is already defined in the scope

       sayi = 40;

       sayi = 56;


        // 2 * sayi = 40; // kabul edilmez
        // java'da eşitliğin sol tarafına SADECE variable olmalıdır.

        sayi = sayi + 10; //66

        sayi = 2 * sayi - 5 ; //127

        System.out.println(sayi);
    }

}
