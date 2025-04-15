package P_Aeroporto;

import java.sql.Time;
import java.util.Date;

public class Volo {
    private int idVolo;
    private String Compagnia;
    private String A_Volo_Destinazione;
    private String A_Volo_Origine;
    private Date Data_Volo;
    private Time Ora_Volo_Prevista;
    private Time Ritardo;
    private StatoVolo stato;

    public Volo(int idVolo, String Compagnia, String A_Volo_Destinazione, String A_Volo_Origine, Date Data_Volo, Time Ora_Volo_Prevista, StatoVolo stato, Time Ritardo) {
            this.Compagnia = Compagnia;
            this.A_Volo_Destinazione = A_Volo_Destinazione;
            this.A_Volo_Origine = A_Volo_Origine;
            this.Data_Volo = Data_Volo;
            this.Ora_Volo_Prevista = Ora_Volo_Prevista;
            this.Ritardo = Ritardo;
            this.stato = stato;
        }

        public void setIdVolo ( int idVolo){
            this.idVolo = idVolo;
        }
        public int getIdVolo () {
            return idVolo;
        }
        public void setA_Volo_Origine (String A_Volo_Origine){
            this.A_Volo_Origine = A_Volo_Origine;
        }
        public String getA_Volo_Origine () {
            return A_Volo_Origine;
        }
        public void setA_Volo_Destinazione (String A_Volo_Destinazione){
            this.A_Volo_Destinazione = A_Volo_Destinazione;
        }
        public String getA_Volo_Destinazione () {
            return A_Volo_Destinazione;
        }
        public void setCompagnia (String Compagnia){
            this.Compagnia = Compagnia;
        }
        public String getCompagnia () {
            return Compagnia;
        }
        public void setData_Volo (Date Data_Volo){
            this.Data_Volo = Data_Volo;
        }
        public Date getData_Volo () {
            return Data_Volo;
        }
        public void setOra_Volo_Prevista (Time Ora_Volo_Prev){
            this.Ora_Volo_Prevista = Ora_Volo_Prev;
        }
        public Time getOra_Volo_Prevista () {
            return Ora_Volo_Prevista;
        }
        public void setRitardo (Time Ritardo){
            this.Ritardo = Ritardo;
        }
        public Time getRitardo () {
            return Ritardo;
        }
        public void setStato (StatoVolo stato){
            this.stato = stato;
        }
        public StatoVolo getStato () {
            return stato;
        }
    }


