package day04_matematikselislemler_Increment;

public class C09_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int a = 40;

        int b = a++;
        //önce a'nın değerini b'ye ata
        //sonra a'nın değerini 1 artır

        System.out.println("a: "+a + ", b: "+b); //a: 41, b: 40


        int c= 2* a + b++;
        //işlemi yap
        //b'nin değerini 1 artır (once artır)

        System.out.println("a: "+a + ", b: "+b +", c: " +c);


        int k= 10;

        int m = 2* k--;

        System.out.println("k: "+k + ", m: "+m);

        int p = --k + 2 * m;

        System.out.println("k: "+k + ", m: "+m +", p: " +p);



    }
}
