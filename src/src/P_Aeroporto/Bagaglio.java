package P_Aeroporto;

public class Bagaglio {
    private String codice;
    private StatoBagaglio stato;

    public Bagaglio(String codice, StatoBagaglio stato) {
        this.codice = codice;
        this.stato = stato;
    }
    public void setStato(StatoBagaglio stato) {
       this.stato = stato;
    }
    public StatoBagaglio getStato() {
        return stato;
    }
    public void setCodice(String codice) {
        this.codice = codice;
    }
    public String getCodice() {
        return codice;
    }
}
