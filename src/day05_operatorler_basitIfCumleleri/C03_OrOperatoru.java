package day05_operatorler_basitIfCumleleri;

public class C03_OrOperatoru {
    public static void main(String[] args) {

        /*
            || operatoru de  && gibi sonuc odaklıdır
            bir tane true bulduğunda sonucun true olacağını bilir
            ve egriye kalan işlemleir yapmaz


            EGER atamalar onemliyse
            atama işlemlerini || işleminden once yapabilirsiniz
         */

        boolean deger1 = false;
        boolean deger2 = false;
        boolean deger3 = false;

        int a = 10;
        int b= 15;

        boolean genelSonuc = (deger1 = a<b) || (deger2 = a>0) || (deger3 = b>5);

        System.out.println("deger1: "+deger1); //true
        System.out.println("deger2: "+deger2);// false
        System.out.println("deger3: "+deger3);//false
        System.out.println("genelSonuc: "+genelSonuc); //true


         deger1 = false;
         deger2 = false;
         deger3 = false;

        genelSonuc = (deger1 = a<b) | (deger2 = a>0) | (deger3 = b>5);

        System.out.println("deger1: "+deger1); //true
        System.out.println("deger2: "+deger2);// true
        System.out.println("deger3: "+deger3);//true
        System.out.println("genelSonuc: "+genelSonuc); //true


    }
}
