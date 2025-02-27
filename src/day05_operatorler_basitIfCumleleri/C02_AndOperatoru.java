package day05_operatorler_basitIfCumleleri;

public class C02_AndOperatoru {
    public static void main(String[] args) {


        boolean deger1 = true;
        boolean deger2 = false;
        boolean deger3 = true;
        boolean deger4 = false;

        int a = 10;
        int b = 15;

        boolean genelSonuc = (deger1 = a<b) && (deger2 = a>0) && (deger3 = b<0) && (deger4 = b>0);

        System.out.println(genelSonuc); //false
        System.out.println("deger4: "+ deger4); //en bastaki sonuca göre false olur atama işlemi gerçekleşrititmedi

        //işlem sırasında son atama yapılmadığı için işlem kısmen hızlı olur
        //AMMAA son atamadaki ıslem önemli ise o islem yapılmamış oldu


         deger1 = true;
         deger2 = false;
         deger3 = true;
         deger4 = false;

         genelSonuc = (deger1 = a<b) & (deger2 = a>0) & (deger3 = b<0) & (deger4 = b>0);

        System.out.println(genelSonuc); //false
        System.out.println("deger4: "+ deger4); //true

        //işlem odaklı olduğu için & operatoru 4 işlemi de yapar
        // 4 islemi de kontrol ettiği için &&'e göre biraz yavas olur
        //tum işlemleri yaptığı için deger4'e doğru degerin atanmasını sağlar




    }
}
