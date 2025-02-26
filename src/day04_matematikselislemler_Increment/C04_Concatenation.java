package day04_matematikselislemler_Increment;

public class C04_Concatenation {

    public static void main(String[] args) {

        //sadece verilen variable'ları kullanarak
        //asagıdaki metinleri yazdırın

        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";

        int a= 5;
        int b= 3;

        //Java Candir 35

        System.out.println(s1 + s3 + s2 + s3 + b + a);

        // Java 8

        System.out.println(s1 + s3 + (5 + 3));

        // 8 Candir

        System.out.println((a+ b) + s3 + s2);

        //35

        System.out.println(b + s4 + a);

        boolean b1 = true;
        char chr = 'v';
        String str = "Java";

      //  System.out.println(b1 + chr + str); //once soldaki ıslem yapıldığından boolean + char CTE verir

        System.out.println(b1 + str + chr); //trueJavav



    }
}
