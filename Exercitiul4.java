public class Exercitiul4 {
    /*
    Creati o metoda care calculeaza si afiseaza suma tuturor numerelor de la 0< n (n sa fie dinamic: ca argument). De ex. n=5 - suma pina la 5 este 10
     */
    public int method1(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;

    }
    /*
    Creati o metoda care afiseaza toate cifrele pare pina la un nr n (n sa fie dinamic: ca argument). De ex. n=5, cifrele pare pina la 5 sunt 0,2,4
     */
    public void method2(int n) {
        for (int i = 0; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }
    /*
    Creati o metoda care afiseaza la ecran "Hello" de 10 ori
     */
        public void method3(){
            for (int i=0;i<=10; i++){
                System.out.println("Hello!");
            }

        }
        /*
        Creati o metoda care afiseaza toate cifrele impare pina la un nr n (n sa fie dinamic: ca argument). De ex. n=5, cifrele pare pina la 5 sunt 1,3
         */
        public void method4(int n2){
            for (int i=0;i<=n2;i++){
                if(i%2!=0){
                    System.out.print(i + " ");
                }
            }

        }



    public static void main(String[] args) {
        Exercitiul4 obj1 = new Exercitiul4();
       System.out.println(obj1.method1(5));
       obj1.method2(5);
        obj1.method3();
        obj1.method4(5);
    }
}
