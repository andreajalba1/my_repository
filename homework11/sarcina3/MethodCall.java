/*
 Construiti o clasa si in ea sa veti 2 proprietati private. Gasiti un mod de a seta si citi valoarea proprietatilor din afara fara a schimba alt modificator de acces.
 */

package md.tekwill.homework11.sarcina3;
import java.lang.reflect.Method;


public class MethodCall {

    public static void main(String[] args) throws Exception {

V v = new V();
        Method m = V.class.getDeclaredMethod("message");
        m.setAccessible(true);
        m.invoke(v);

        Method m2 = V.class.getDeclaredMethod("message2");
        m2.setAccessible(true);
        m2.invoke(v);
    }
}
