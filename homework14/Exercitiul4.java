/*
4. One class with three overloaded constructors using "this()".Use "this" to assign the passed parameters to class properties.
 */

package md.tekwill.homework.homework14;

public class Exercitiul4 {
    int id;
    String nume;
    String prenume;
    int ani;
    String oras;
    double salariu;

    public Exercitiul4(int id, String nume){
        this.id = id;
        this.nume = nume;

    }
    public Exercitiul4(int id, String nume, String prenume){
        this(id,nume);
        this.prenume = prenume;


    }
    public Exercitiul4(int id, String nume, String prenume, int ani, String oras, double salariu){
        this(id, nume, prenume);
        this.ani = ani;
        this.oras =oras;
        this.salariu = salariu;

    }
    public void afiseaza1(){
        System.out.println("id: " + this.id + " nume: " + this.nume);
    }
    public void afiseaza2(){
        System.out.println("id: " + this.id + " nume: " + this.nume + " prenume: " + this.prenume);

    }
    public void afiseaza3(){
        System.out.println("id: " + this.id + " nume: " + this.nume + " prenume: " + this.prenume + " ani: " + this.ani + " oras: " + this.oras + " salariu: " + this.salariu);

    }



    public static void main(String[] args) {
        Exercitiul4 obj1 = new Exercitiul4(1,"Jalba");
        Exercitiul4 obj2 = new Exercitiul4(1,"Jalba", "Andrea");
        Exercitiul4 obj3 = new Exercitiul4(1, "Jalba","Andrea", 22, "Hincesti", 3000.20);
        obj1.afiseaza1();
        obj2.afiseaza2();
        obj3.afiseaza3();


    }
}
