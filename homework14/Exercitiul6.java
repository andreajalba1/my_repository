/*
 6. One class with a method or two that return a type of the current class. Hint: using "this".
 */
package md.tekwill.homework.homework14;

import java.sql.SQLOutput;

public class Exercitiul6 {
    public Exercitiul6 method1(){
        return this;

    }
    public Exercitiul6   method2(){
        return this;

    }

    public static void main(String[] args) {
        Exercitiul6 obj1 = new Exercitiul6();
        System.out.println( obj1.method1());
        System.out.println( obj1.method2());

    }
}
