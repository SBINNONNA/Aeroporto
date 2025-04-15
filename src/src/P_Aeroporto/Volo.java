package P_Aeroporto;

import java.sql.Time;
import java.util.Date;

public class Volo {
    private int idVolo;
    private String Comapgnia;
    private String A_Volo_Destinazione;
    private String A_Volo_Origine;
    private Date Data_Volo;
    private Time Ora_Volo_Prevista;
    private Time Ritardo;
    private StatoVolo stato;

    public Volo(int idVolo,String Compagnia, String A_Volo_Destinazione, String A_Volo_Origine, Date Data_Volo, Time Ora_Volo_Prevista, Time Ritardo, StatoVolo stato ) {
        this.idVolo = idVolo;
        this.Comapgnia = Compagnia;
        this.A_Volo_Destinazione = A_Volo_Destinazione;
        this.A_Volo_Origine = A_Volo_Origine;
        this.Data_Volo = Data_Volo;
        this.Ora_Volo_Prevista = Ora_Volo_Prevista;
        this.Ritardo = Ritardo;
        this.stato = stato;
    }

    public void setA_Volo_Origine(String A_Volo_Origine) {
        this.A_Volo_Origine = A_Volo_Origine;
    }

    public void setA_Volo_Destinazione (String A_Volo_Destinazione) {
        this.A_Volo_Destinazione = A_Volo_Destinazione;
    }

    public String getA_Volo_Destinazione() {
        return A_Volo_Destinazione;
    }
}


