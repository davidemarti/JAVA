
package mainarraystudente;


public class First {
    private String cognomeD; //NETBEANS
    private Studente arrayS[]; //array di oggetti di tipo studente
    private int dim; //dimensione ovvero numero di studenti
    private int nPos; //prima posizione libera dell'array
    
    public First(String cognomeD, int dim){
        this.cognomeD = cognomeD;
        this.dim = dim;
        this.nPos = 0;
        
        arrayS = new Studente[dim]; //creo dim celle di tipo studente
    }
    
    public void aggiungi(Studente s){
        arrayS[nPos] = s;
        nPos++;
    }
    
    public void visualizzaStudentiFirst(){
        for(int i=0; i<nPos; i++)
        {
            System.out.println(arrayS[i]);
        }
    }
    
    public void visualizzaEtaStudenti(){
                for(int i=0; i<nPos; i++)
        {
            System.out.println(arrayS[i].getEtaS());
        }
    }
    
    public void etaMediaStudenti(){
        int somma = 0, media, j = 0;
        for(int i=0; i<nPos; i++)
        {
            somma = somma + arrayS[i].getEtaS();
            j++;
        }
        media = somma / j;
        System.out.println(media);
    }
    
     //conta maggiorenni
    public String contaMaggiorenni()
    {
        int contaM = 0;
     for (int i = 0; i <nPos;i++){
           if(arrayS[i].getEtaS() > 17)
           {
               contaM++;
           }
            }   
     
     return "i maggiorenni sono: " + contaM;
    }

    public String contaIniziale(char x, char y)
    {
        int conta = 0;
        for (int i = 0; i <nPos;i++){
           if(arrayS[i].getNomeS().toUpperCase().charAt(0) == x && arrayS[i].getCognomeS().toUpperCase().charAt(0) == y)
           {
               conta++;
           }
            } 
        return "gli alunni che iniziano con nome " + x + " e cognome " + y + " sono " + conta;
    }
    
    //quanti studenti del corso hanno età comprese fra x e y fornite come parametro
    
    public int compreso(int x, int y)
    {
        int conta = 0;
         for (int i = 0; i <nPos;i++){
           if(x > y)
           {
               if(arrayS[i].getEtaS() >= y && arrayS[i].getEtaS() <= x)
               {
                   conta++;
               }
           }
           else
           {
               if(arrayS[i].getEtaS() >= x && arrayS[i].getEtaS() <= y)
               {
                   conta++;
               }
           }
            }   
         
         return conta;
    }
    
    //visualizzare l'email dello studente nome.cognome@jcmaxwell.it
    public void email()
    {
         for (int i = 0; i <nPos;i++){
             System.out.println(arrayS[i].getNomeS().toLowerCase() + "." + arrayS[i].getCognomeS().toLowerCase() + "@jcmaxwell.it");
            }
    }
    
     public String emailVettore()
    {
        String[] email = new String[10];
         for (int i = 0; i <nPos; i++){
             email[i] = arrayS[i].getNomeS().toLowerCase() + "." + arrayS[i].getCognomeS().toLowerCase() + "@jcmaxwell.it";
            }
         return email[10];
    }
    }

