/*
Pentru acasa construiti o metoda care primeste un String ca rezultat final il returneaza inversat. Folositi doar metode din clasa String, fara a folosi StringBuilder sau StringBuffer.
 */

package md.tekwill.homework.homework13;

public class ClassString {


    public static String stringMeth(String s){
        char ch;
        String abc = "";

        for(int i=0; i<s.length();i++) {
            ch = s.charAt(i); // Extragerea fiecarui caracter
            abc = ch+abc; // Adaugarea fiecarui caracter in fata stringului existent
        }
        return abc;


    }

    public static void main(String[] args) {
        System.out.println("Stringul inversat: "+ClassString.stringMeth("Andrea"));


    }
}
