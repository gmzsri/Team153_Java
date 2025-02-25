package day03_dataCasting_WrapperClasses;

public class C05_CharDataTuruIleCasting {
    public static void main(String[] args) {

        /*
           char data türü özel bir data turudur
           Matematiksel islemlerde kullanıldığında
           ASCII table'daki degeerleri ile isleme girerler


           char data türündeki değerler ve variable'lar
           <, > gibi matematiksel işlemlerde kullanılabilir

           bu durumda java ascii değerlerine bakar
           biz ise önce mi veya sonra mı diye düşünebiliriz

         */
        String str1= "Java";
        String str2= " Candir";

        System.out.println(str1 + str2); //Java Candir

        char chr1= 'a';
        char chr2= 'b';
        char chr3= 'c';

        System.out.println(chr1 + chr2 + chr3); //294
        //ASCII kod tablosunda matematiksel karşılığı olan char karakterleri toplamıştır

        int sayi1 = 'c';

        System.out.println("sayi1'in değeri: "+sayi1); //sayi1'in değeri: 99

        System.out.println('a' < 'e');  //97 < 101 ==> true

        System.out.println('B' < 'b'); //true

        char verilenHarf ='S';

        //verilen harften sonra gelen 3 harfi yazdırın

        System.out.println(verilenHarf + 1); //84

        System.out.println((char) (verilenHarf + 1)); //T
        System.out.println((char) (verilenHarf + 2)); //U
        System.out.println((char) (verilenHarf + 2)); //V

    }
}
