package day04_matematikselislemler_Increment;

public class C07_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        /*
           EGER yazıldıkları satırda tek basına iseler

            ++sayi ile sayi++

            --sayi ile sayi--

            aynı islemi yaparlar ve aralarında bir fark olmaz

            bu islemlerin olduğu satırda yazdırma veya baska bir islem varsa
            aralarında bir fark olur
         */





        // PreIncrement ==> ++a

        //PostIncrement ==> a++

        int sayi = 20;

        sayi ++;

        System.out.println(sayi); // 21

        ++sayi;

        System.out.println(sayi); // 22

        sayi -- ;

        System.out.println(sayi); // 21

        sayi --;

        System.out.println(sayi); //20
    }
}
