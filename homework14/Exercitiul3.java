/*
3. One class with three overloaded constructors.Use "this" to assign the passed parameters to class properties.
 */
package md.tekwill.homework.homework14;

public class Exercitiul3 {
    int id;
    String nume;
    String prenume;
    int ani;
    String oras;
    double salariu;

    public Exercitiul3(int id, String nume) {
        this.id = id;
        this.nume = nume;

    }

    public Exercitiul3(String prenume, int ani) {
        this.prenume = prenume;
        this.ani = ani;

    }

    public Exercitiul3(String oras, double salariu) {
        this.oras = oras;
        this.salariu = salariu;
    }
    public  void afiseaza(){
        System.out.println("id:" + this.id + " Numele: " + this.nume );
    }
    public void afiseaza2(){
        System.out.println("Prenumele: " + this.prenume + " ani: " + this.ani);

    }
    public void afiseaza3(){
        System.out.println("oras: " + this.oras + " salariu: " + this.salariu);

    }




    public static void main(String[] args) {
        Exercitiul3 obj1 = new Exercitiul3(1, "Jalba");
        Exercitiul3 obj2 = new Exercitiul3("Andrea", 22);
        Exercitiul3 obj3 = new Exercitiul3("Hincesti", 3000.50);

        obj1.afiseaza();
        obj2.afiseaza2();
        obj3.afiseaza3();





    }
}
