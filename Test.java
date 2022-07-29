public class Test {
    public static void main(String[] args) {
        Exercitiul3 obj1 = new Exercitiul3();
        obj1.var1 =2;
        obj1.var2 = "Hi";
        obj1.var3 = 20.45;
        obj1.var4 = true;

        System.out.println(obj1.var1 =2);
        System.out.println(obj1.var2 = "Hi");
        System.out.println(obj1.var3 = 20.45);
        System.out.println(obj1.var4 = true);

        System.out.println( obj1.metoda1(1));
       obj1.metoda2("Hello", "World");
        System.out.println(obj1.metoda3());
        System.out.println(obj1.metoda4('c'));

    }
}
