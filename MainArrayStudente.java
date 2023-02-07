
package mainarraystudente;


public class MainArrayStudente {

    public static void main(String[] args) {
        //oggeti della classe studente
        Studente s1 = new Studente("Mario","Rossi",15);
        Studente s2 = new Studente("Mario","Neri",19);
        Studente s3 = new Studente("Luigi", "Verdi", 18);
        
       // System.out.println(s2.getNomeS());  //visualizza mario 
        //s2.setNomeS("Matteo");
       // System.out.println(s2.getNomeS());  //visualizza matteo 
        //creo oggetti della classe First
        First f1 = new First("Lupo", 30);
        f1.aggiungi(s1);
        f1.aggiungi(s2);
        f1.aggiungi(s3);
        f1.visualizzaStudentiFirst();
        /*f1.visualizzaEtaFirst();
        
        System.out.println("Media Studenti First = "+f1.etaMediafirst());
        System.out.println(f1.contaMaggiorenni());
        
         System.out.println("i nomi che iniziano con la lettera ... sono " + f1.contaIniziale('M'));
         
           System.out.println("studenti con eta compresa =  " + f1.etaComprese(17, 22));*/
           //f1.creaEmail();
           f1.creaVettMail();
    }
    
}
