package day03_dataCasting_WrapperClasses;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {


        /*

        Explicit narrowing yaptığımızda
        daha kapsamlı bir değeri , daha küçük kapsamlı bir variable'a atama yapıypruz

        değer variable'nin içinde ise
        explicit narrowing yaptığımızda aynı değere sahip olur

        ANCAKKKKK eğer değer variable'nin sınırlarından büyük ise
        bu durumda değer farklı bir sonuca dönüsebilir

         */
       int sayi1=43;
       int sayi2= 130;
       int sayi3= 150;
       int sayi4= 262;
       int sayi5 = 520;

       double dbl1= 34.1;
       double dbl2= 45.97;

       byte byt = 25;

       sayi1= (int) dbl1;
       System.out.println("34.1'in int'a cast edilmiş hali: "+ sayi1);

        // cast işlemi gerçekleştirildiğinde double türünde değişkenin virgülden sonrasını
        //direkt atar
        sayi1= (int) dbl2;
        System.out.println("45.97'in int'a cast edilmiş hali: "+ sayi1);



        byt= (byte) sayi1;
        System.out.println("43'ün byte'a cast edilmiş hali: "+ sayi1);

        byt= (byte) sayi2;
        System.out.println("130'un byte'a cast edilmiş hali: "+ sayi1);
        // 130 değeri byte data tipinin aralığında değildir
        // byte -128 ile 127 arasındadır



    }
}
