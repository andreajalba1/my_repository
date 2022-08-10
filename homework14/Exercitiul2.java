/*
 2. One class with 3 oveloaded methods.
 */

package md.tekwill.homework.homework14;

public class Exercitiul2 {

    public static int aria(int latimea, int lungimea){
        int A = latimea * lungimea;
        return A;

    }
    public static double aria(int raza){
        double pi = 3.14;
       double A =  pi * raza*raza;
        return A;

    }
    public static double aria(double l){
        double A = l * l;
        return A;

    }

    public static void main(String[] args) {
        System.out.println("Aria cercului: " + Exercitiul2.aria(10));
        System.out.println("Aria dreptunghiului: " + Exercitiul2.aria(10,20));
        System.out.println( "Aria patratului: " + Exercitiul2.aria(13.4));


    }

}
