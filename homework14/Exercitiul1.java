/*
1. One class with two or three methods. In the first method call the second and third method with "this" keyword.
 */

package md.tekwill.homework.homework14;

public class Exercitiul1 {

    public  int method1(int a){

        this.method2("Andrea");
        System.out.println(this.method3());
         return 10;
    }

    public  void method2(String s){
        System.out.println("Method2");

    }

    public  char method3(){
        return 'c';
    }

    public static void main(String[] args) {
       Exercitiul1 f = new Exercitiul1();
        System.out.println( f.method1(10));

    }

}
