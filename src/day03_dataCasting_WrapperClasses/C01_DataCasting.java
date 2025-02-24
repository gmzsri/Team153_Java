package day03_dataCasting_WrapperClasses;

public class C01_DataCasting {
    public static void main(String[] args) {

        /*

        1- String veya booelan başka data türünden değer dönüşümü
           kabul etmez

        2- char özel olarak incelenecek
           ama string boolean float ve double değer kabul etmez
           sadece tam sayı değerleri alan data tipine çevrilebilir

        3- sayısal data türlerine gelince
           dar kapsamlı değeri, geniş kapsamlı variable'a atamak istersek
           java bu işlemi otomatik olarak yapar
           bu işleme "AUTO WIDENING" (otomatik genişletme) denir

         */



        boolean b1= true;
        char chr ='a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng= 40;
        float flt = 3.5f;
        double dbl = 4.7;
        String str = "Java";

        // boolean data türü sadece true ve false kanul eder başka hiçbir data türünü kabul etmez.

        //daha küçük kapsamlı data türündeki variable'ı daha buyuk kapsamlı data türündeki variable'a atamak istediğimizde
        // java otomatik olarak gerçekleştirir.

        // Sırasıyla ;
        //byte short int long float double



    }
}
