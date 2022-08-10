/*
5. One class with a method that has a parameter.When calling the method, it should be posible to pass "this" as parameter.
 */
package md.tekwill.homework.homework14;

public class Exercitiul5 {
    public void method1(Exercitiul5 obj1) {
        System.out.println("Exercitiul5");

    }
    public void method2(){
        method1(this);

    }

    public static void main(String[] args) {
        Exercitiul5 obj2 = new Exercitiul5();
        obj2.method2();

    }
}

