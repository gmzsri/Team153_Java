package day04_matematikselislemler_Increment;

public class C08_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int a = 20;

        System.out.println(a++); //20
        // burda iki işlem var
        // biri a'nın degerini 1 artır
        //diğeri a'nın degerını yazdır
        //yazdırma ya da artırma islemi oncelik hangisine verilmise onu yap

        System.out.println(a); //21



         int b= 20;

        System.out.println( ++b); //21
        //burda once artırma işlemi yapar yazdırma işlemi yapar

        System.out.println(b);




        int c= 20;

        System.out.println(c--); //20

        System.out.println(c); //19




        int d = 20;

        System.out.println(--d);//19

        System.out.println(d); //19


    }
}
