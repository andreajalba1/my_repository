
/*
Construiti 3 pachete diferite. In fiecare pachet sa aveti cite o clasa cu citeva metode private , default si publice. Construiti obiecte in alte pachete si observati rezultatele

 */

package md.tekwill.homework11.sarcina1.pack1;
import md.tekwill.homework11.sarcina1.pack2.B;
import md.tekwill.homework11.sarcina1.pack3.C;

public class A {
    public void met1() {
        System.out.println("Metoda1");
    }

   private int met2(int m) {
        return 10;
   }

   String met3(){
        return "met3";
   }

   public void met4(char m) {
       System.out.println("Char de la met4: " + m);
   }

    public static void main(String[] args) {
        B b1 = new B();
        C c1 = new C();
        A a1 = new A();

        System.out.println( b1.met6("String"));
        System.out.println(c1.met9());

        a1.met1();
        System.out.println(a1.met2(12));
        System.out.println(  a1.met3());
        a1.met4('r');

    }


        }



