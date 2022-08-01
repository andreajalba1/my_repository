/*
Construiti o clasa si in ea sa aveti o metoda publica care cheama in ea alte 2 metode private. Apoi din afara pachetului accesati metoda publica.
 */

package md.tekwill.homework11.sarcina2;

public class Class1 {

    public void method1(){
        method2();
        method3();

    }

    private void method2(){
        System.out.println("method2");
    }

    private void method3(){
        System.out.println("method3");
    }

}
