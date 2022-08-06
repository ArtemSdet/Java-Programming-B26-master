package day04_04_25_2022.packageB;

import day04_04_25_2022.packageA.First;

public class Third extends First{
    public static void main(String[] args) {
        First obj = new First();

        System.out.println(obj.a);
        //System.out.println(obj.b);
        //System.out.println(obj.c);
        //System.out.println(obj.d);

        System.out.println(First.e);

        Third obj2 = new Third();
        System.out.println(obj2.b);
    }
}
