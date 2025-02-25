package day03_dataCasting_WrapperClasses;

public class C07_FaydaliWrapperClassMethodlari {
    public static void main(String[] args) {

        String fiyat1 = "21.28";
        String fiyat2 = "15.46";

        //belirli formatta verilen iki fiyatın toplamını yazdırın

       double fyt1 = Double.parseDouble(fiyat1);
       double fyt2 = Double.parseDouble(fiyat2);

        System.out.println("fiyatların toplamı : "+ (fyt1 + fyt2));


        fiyat1 = "45";
        fiyat2 = "48";

        //fiyat1 fiyat2'den kucuk ise true, degilse false yazdırın

        int fy1= Integer.parseInt(fiyat1);
        int fy2 = Integer.parseInt(fiyat2);

        System.out.println(fy1 < fy2);

        //int bir sayının maximum kaç olabileceğini yazdırın

        System.out.println(Integer.MAX_VALUE);

        //short bir sayının min kaç degerini alabileceğini yazdır

        System.out.println(Short.MIN_VALUE);

        //Character classında kullanabileceğimiz bazı özellikler

        char ch1 = 'a';
        char ch2 = 'K';

        //ch1' i büyük harf olarak yazdırın

        System.out.println(Character.toUpperCase(ch1)); //A

        //ch2'yi kucuk harfle yazdırın

        System.out.println(Character.toLowerCase(ch2)); //k

        //ch1 sayi mi ?

        System.out.println( Character.isDigit(ch1)); //false

        //ch2 büyük harf mi

        System.out.println(Character.isUpperCase(ch2)); //true

        //ch2 alfabetik mi

        System.out.println(Character.isAlphabetic(ch2)); //true

        //ch2 harf mi

        System.out.println(Character.isLetter(ch2)); //true

    }
}
