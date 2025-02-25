package day03_dataCasting_WrapperClasses;

public class C06_WrapperClasses {
    public static void main(String[] args) {


        String str = "Java Candir";

        System.out.println(str.toUpperCase()); //JAVA CANDİR
        System.out.println(str.toLowerCase());//java candir

        //primitivlerin hazır metotları yoktur

        int sayi = 20;

        /*
           primitivlerin hazır metotları olmaz
           java'da primitivleirn de bazı methodları kullanabilmesi için
           aynı isimlerde wrapper Class'lar oluşturulmuştur

           boolean - char      - byte -  short - int - long - float -  double
           Boolean - Character - Byte - Short - Integer - Long - Float - Double
         */

        byte byt1 = 24;

        int sayi1= byt1;  //auto widening - otomatik genişletme

        short shrt1 = (short) sayi1; //explicit narrowing - zorla genişletme


        int sayi2= 45;
        Integer sayi3 = sayi2;

        Boolean bl1 = true;
        boolean bl2 = bl1;


        //sayi barındıran primitive data türleri arasında casting mumkun
        //ayni isimdeki primitive ile wrapper classlar arasında da geciş mumkundur
        //ANCAKKK farklı wrapper classları
        // ya da farklı isimdeki bir primitive ile Wrapper class arasında casting mumkun değildir

        Integer sayi4= 45;

        //Double sayi6 = sayi4;  //Integer'ı Double auto widening yapmaz

        int sayi7 = sayi4; // int <== Integer

       // Double sayi8 = sayi4;  // Double<== Integer



    }
}
