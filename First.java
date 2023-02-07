
package mainarraystudente;


public class First {
    
    private String cognomeD;
    private Studente arrayS[];  //array di oggetti di tipo studente
    private int dim;  //dimensione ovvero numero di studenti
    private int nPos;  //prima posizione libera dell'array
    
    public First(String cognomeD, int dim) {
        this.cognomeD=cognomeD;
        this.dim=dim;
        this.nPos=0;
        
        arrayS=new Studente[dim];//creo dim celle di tipo Studente
    }
    
    //inserisce uno studente fornito come parametro all'array
    public void aggiungi(Studente s){
    
        arrayS[nPos]=s;
        nPos++;
    }
    
    public void visualizzaStudentiFirst(){
        
        for(int i=0; i<nPos; i++){
            System.out.println(arrayS[i]);
        }
    }
    
    //visualizzare età studenti First
    
    public void visualizzaEtaFirst(){
        
        for (int i = 0; i <nPos;i++){
            System.out.println(arrayS[i].getEtaS());
        }
    }
   
    //calcolare eta media degli studenti del First
    
    public double etaMediafirst(){
        int somma=0;
        
        for (int i = 0; i <nPos;i++){
            somma=arrayS[i].getEtaS()+somma;
        }
        
        return (double)somma/nPos;
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
     
    // contaIniziale(): conta quanti studenti hanno nome che inizia con una 
    //lettera fornita come parametro
    
     public int contaIniziale(char charX)
    {
        int conta=0;
               for (int i = 0; i <nPos;i++)
               {
                   if(arrayS[i].getNomeS().toUpperCase().charAt(0)==charX || 
                           arrayS[i].getNomeS().toLowerCase().charAt(0)==charX)
                   {
                     conta++;
                   }
               }
         return conta;      
    }

     
     // quanti Studenti del corso hanno età comprese fra x e y fornite come parametro?
     public int etaComprese( int x , int y )
{
    if(x>y)
    {
        int temp =x;
        x = y;
        y= temp;
    }
    int cont=0;
    for (int i = 0; i <nPos;i++)
    if(arrayS[i].getEtaS()> x && arrayS[i].getEtaS() < y)
    {
        cont++;
    }
    return cont;   
}
   
     //  visualizza la mail
      public void creaEmail(){
        for(int i = 0;i<nPos;i++)
        {
        System.out.println(arrayS[i].getNomeS().toLowerCase()+"."
                + arrayS[i].getCognomeS().toLowerCase()+"@jcmaxwell.it");
        }
      }
     
     
     // crea VettoreMail
      public void creaVettMail(){
         String[] vettMail = new String[10];
   for(int i=0;i<nPos;i++)
   {
       
       vettMail[i]= arrayS[i].getNomeS().toLowerCase()+"."+ arrayS[i].getCognomeS().toLowerCase()
               +"@jcmaxwell.it";
   }
    for(int i=0;i<nPos;i++){
      {System.out.println(vettMail[i]+" ");}
}

     
     
     
}
}
