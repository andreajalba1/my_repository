/*
Construiti 3 pachete diferite. In fiecare pachet sa aveti cite o clasa cu citeva metode private , default si publice. Construiti obiecte in alte pachete si observati rezultatele
 */

package md.tekwill.homework11.sarcina1.pack3;
import md.tekwill.homework11.sarcina1.pack1.A;
import md.tekwill.homework11.sarcina1.pack2.B;

public class C {


    private void met8() {
        System.out.println("Met8");
    }

    public long met9(){
        return 890L;
        }

        String met10(boolean b){
        return "Metoda 10";
        }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.met1();
          a.met4('v');

        System.out.println(  b.met6("Andrea"));
       c.met8();
       System.out.println( c.met9());
       System.out.println( c.met10(true));



    }
    }

