/*
Creati o clasa Person care sa aiba 3 proprietati. Long id , String firstName, lastName. Face-ti in asa fel incit atunci cind creati cite un obiect in main, id sa se incrementeze. Adica pentru fiecare obiect creat, sa-i fie generat pe durata rularii programului, un id unic.
 */
package md.tekwill.homework.homework12;

public class Person {
   public long id;
   public String firstName;
   public String lastName;
 public static int c=0;

 public Person() {
     c++;
 }
 public void setId(long id1){
     id=id1;
 }
 public long getId(){
     return id;
 }




}
