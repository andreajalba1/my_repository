/*
Construiti 3 pachete diferite. In fiecare pachet sa aveti cite o clasa cu citeva metode private , default si publice. Construiti obiecte in alte pachete si observati rezultatele
 */

package md.tekwill.homework11.sarcina1.pack2;
import md.tekwill.homework11.sarcina1.pack1.A;
import md.tekwill.homework11.sarcina1.pack3.C;

public class B {

     void met5(){
         System.out.println("met5");
     }

     public boolean met6(String m) {
         return true;
     }

     private int met7(){
         return 7;
     }

    public static void main(String[] args) {
        A a2 = new A();
        B b2 = new B();
        C c2 = new C();

        a2.met1();
        a2.met4('g');
        System.out.println( c2.met9());
        b2.met5();
        System.out.println(b2.met6("Andrea"));
        System.out.println( b2.met7());
    }
}
