
package mainarraystudente;


public class Studente {
   private String nomeS;
   private String cognomeS;
   private int etaS;

    public Studente(String nomeS, String cognomeS, int etaS) {
        this.nomeS = nomeS;
        this.cognomeS = cognomeS;
        this.etaS = etaS;
    }

    public String getNomeS() {
        return nomeS;
    }

    public String getCognomeS() {
        return cognomeS;
    }

    public int getEtaS() {
        return etaS;
    }

    public void setNomeS(String nomeS) {
        this.nomeS = nomeS;
    }

    public void setCognomeS(String cognomeS) {
        this.cognomeS = cognomeS;
    }

    public void setEtaS(int etaS) {
        this.etaS = etaS;
    }

    @Override
    public String toString() {
        return "Studente{" + "nomeS=" + nomeS + ", cognomeS=" + cognomeS + ", etaS=" + etaS + '}';
    }
    
    
   
}

