package day03_dataCasting_WrapperClasses;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        /*

        1-Daha dar kapsamlı değeri, geniş kapsamlı variable'a atamak istersek
           java bu işlemi otomatik olarak yapar
           bu işleme "AUTO WIDENING" (otomatik genişletme) denir

        2-daha geniş kapsamlı bir değeri
          daha dar kapsamlı bir variable'a atamak istersek
          Java bu işlemi otomatik olarak yapmaz
          değerin önüne parantez () içinde çevirmek istediğimiz
          data türünü yazarız.
          Bu işleme Explicit-Norrowing(Zorlayarak daraltma) denir


         */
        char chr ='a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng= 40;
        float flt = 3.5f;
        double dbl = 4.7;

        // Compile time'da Java değerlerle ilgilenmez
        //data türlerini kontrol eder

        byt = (byte) shrt;  //parantez içine çevirmek istediğimiz data tipini yaz
        byt= (byte) sayiInt;

        shrt= (short) sayiInt;
        shrt= (short) flt;

        sayiInt= (int) lng;
        sayiInt=(int) dbl;

        flt=(float) dbl;

    }
}
