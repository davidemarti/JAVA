
package mainarraystudente;


public class MainArrayStudente {

    public static void main(String[] args){
        //oggetti della classe Studente
    Studente s1 = new Studente("Aario", "Mossi", 15);
    Studente s2 = new Studente("Mario", "Neri", 17);
    Studente s3 = new Studente("Luigi", "Verdi", 18);
    Studente arrayS[] = new Studente[10];
    
    System.out.println(s2.getNomeS()); //visualizza Mario
    s2.setNomeS("Matteo");
    System.out.println(s2.getNomeS()); //visualizza Matteo
    
    //creo oggetti della classe First
    First f1 = new First("Lupo", 30);
    f1.aggiungi(s1);
    f1.aggiungi(s2);
    f1.visualizzaStudentiFirst();
    f1.visualizzaEtaStudenti();
    f1.etaMediaStudenti();
    System.out.println(f1.contaMaggiorenni());
    System.out.println(f1.contaIniziale('M', 'N'));
    System.out.println("le eta' comprese fra ..... e ..... sono " + f1.compreso(5, 20));
    f1.email();
    System.out.println(f1.emailVettore());
    }
    
}

